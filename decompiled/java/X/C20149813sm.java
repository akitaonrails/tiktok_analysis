package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.selector.EcChoosePhotoActivity;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.vesdk.utils.BitmapLoader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS237S0300000_28;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13sm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20149813sm extends AbstractC1891310zJh {
    public static int LLIZLLLIL;
    public static int LLJ;
    public boolean LLILLL;
    public int LLILZ = 4;
    public boolean LLILZIL;
    public CompletionBlock<InterfaceC1891280zJe> LLILZLL;
    public final ExecutorService LLIZ;

    public final void LIZLLL() {
        Context context;
        C19EG c19eg;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC == null || (context = interfaceC634840OvC.getContext()) == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) EcChoosePhotoActivity.class);
        intent.putExtra("result_code", 41313);
        if (!(context instanceof C19EG) || (c19eg = (C19EG) context) == null) {
            return;
        }
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19eg, intent, "Activity_startActivityForResult_2");
        C1701330uNH.LIZ(intent, c19eg);
        C2204961BRm.LLJJJJJIL(10005, intent, c19eg, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnunYfVY5KkLgb010Lku2xgQfdJ9UHyojZ+ZvwYmXdxuyWLw+Q==", null));
    }

    public C20149813sm() {
        C2123408To c2123408ToLIZ = C2123508Tp.LIZ(C0WQX.SERIAL);
        c2123408ToLIZ.LIZIZ = "compressPhoto";
        this.LLIZ = C823050WQl.LIZ(c2123408ToLIZ.LIZ());
    }

    public final void LJ(final C19EG c19eg, List list) {
        int i;
        if (!list.isEmpty()) {
            if (!list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (C2093608Ic.LJ(((Uri) it2.next()).toString())) {
                    }
                }
            }
            final ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                arrayList.add(((Uri) it3.next()).toString());
            }
            if (this.LLILLL && ((i = this.LLILZ) == 1 || i == 2 || i == 3)) {
                ExecutorService executorService = this.LLIZ;
                final AwS237S0300000_28 awS237S0300000_28 = new AwS237S0300000_28(this, c19eg, arrayList, 25);
                executorService.execute(new Runnable(c19eg, arrayList, awS237S0300000_28) { // from class: X.09MV
                    public final Activity LL;
                    public final List<String> LLILLJJLI;
                    public final Function1<List<String>, Unit> LLILLL;

                    /* JADX WARN: Multi-variable type inference failed */
                    public final void LIZ() {
                        ArrayList arrayList2;
                        String strLIZ;
                        Bitmap bitmap;
                        String strLIZ2;
                        List<String> list2 = this.LLILLJJLI;
                        int i2 = C20149813sm.LLIZLLLIL;
                        int i3 = C20149813sm.LLJ;
                        Activity activity = this.LL;
                        if (C09MW.LIZ) {
                            arrayList2 = new ArrayList();
                            for (String str : list2) {
                                C259800zU c259800zU = new C259800zU();
                                CountDownLatch countDownLatch = new CountDownLatch(1);
                                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                                c1331670kl3LJIIIZ.LIZJ = activity;
                                c1331670kl3LJIIIZ.LJJII(new C2501909rF(c259800zU, countDownLatch, 0));
                                try {
                                    if (countDownLatch.await(10L, TimeUnit.SECONDS) && (bitmap = (Bitmap) c259800zU.element) != null && (strLIZ2 = C09MX.LIZ(i2, i3, bitmap)) != null) {
                                        arrayList2.add(strLIZ2);
                                    }
                                } catch (InterruptedException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    C786410Ut5.u3().interrupt();
                                    C1AF0.LJ(e);
                                }
                            }
                        } else {
                            arrayList2 = new ArrayList();
                            Iterator<String> it4 = list2.iterator();
                            while (it4.hasNext()) {
                                Bitmap bitmapLoadBitmapCompat = BitmapLoader.loadBitmapCompat(activity.getApplication().getContentResolver(), it4.next(), 0, 0);
                                if (bitmapLoadBitmapCompat != null && (strLIZ = C09MX.LIZ(i2, i3, bitmapLoadBitmapCompat)) != null) {
                                    arrayList2.add(strLIZ);
                                }
                            }
                        }
                        this.LLILLL.invoke(arrayList2);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("EcChooseMediaV2Method$GenerateMultiResponseTask@af9f.run");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("EcChooseMediaV2Method$GenerateMultiResponseTask@af9f.run");
                    }

                    {
                        this.LL = c19eg;
                        this.LLILLJJLI = arrayList;
                        this.LLILLL = awS237S0300000_28;
                    }
                });
                return;
            }
            LIZJ(c19eg, arrayList, null, arrayList);
            return;
        }
        CompletionBlock<InterfaceC1891280zJe> completionBlock = this.LLILZLL;
        if (completionBlock != null) {
            C2382909Vj.LIZ(completionBlock, 0, "Path empty", null, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        final Context context;
        String str;
        InterfaceC1891320zJi interfaceC1891320zJi = (InterfaceC1891320zJi) xBaseParamModel;
        Number compressOption = interfaceC1891320zJi.getCompressOption();
        if (compressOption != null) {
            iIntValue = compressOption.intValue();
        } else {
            iIntValue = 4;
        }
        this.LLILZ = iIntValue;
        Boolean needBase64Data = interfaceC1891320zJi.getNeedBase64Data();
        Boolean bool = Boolean.TRUE;
        this.LLILZIL = Intrinsics.LJFF(needBase64Data, bool);
        this.LLILLL = Intrinsics.LJFF(interfaceC1891320zJi.getCompressImage(), bool);
        Number compressWidth = interfaceC1891320zJi.getCompressWidth();
        if (compressWidth != null) {
            iIntValue2 = compressWidth.intValue();
        } else {
            iIntValue2 = 0;
        }
        LLIZLLLIL = iIntValue2;
        Number compressHeight = interfaceC1891320zJi.getCompressHeight();
        if (compressHeight != null) {
            iIntValue3 = compressHeight.intValue();
        } else {
            iIntValue3 = 0;
        }
        LLJ = iIntValue3;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != 0) {
            if (context instanceof InterfaceC1432560nNm) {
                ((InterfaceC1432560nNm) context).KF(new InterfaceC1387820mDc() { // from class: X.13sn
                    @Override // X.InterfaceC1387820mDc
                    public final void onActivityResult(int i, int i2, Intent intent) {
                        ArrayList arrayList;
                        C19EG c19egLIZIZ;
                        if (i != 10005) {
                            return;
                        }
                        if (i2 != 0 && intent != null) {
                            try {
                                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("choose_photo");
                                if (parcelableArrayListExtra != null) {
                                    arrayList = new ArrayList(C15438062q.LJIJJ(parcelableArrayListExtra, 10));
                                    Iterator it2 = parcelableArrayListExtra.iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add(UriProtector.parse(((MediaModel) it2.next()).originLocalUriPath));
                                    }
                                } else {
                                    arrayList = new ArrayList();
                                }
                                if (i2 == 41313 && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
                                    this.LIZ.LJ(c19egLIZIZ, arrayList);
                                    return;
                                }
                                return;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C1019103yf.LIZ(EnumC1014603xw.UNKNOWN_ERR, null, null);
                                CompletionBlock<InterfaceC1891280zJe> completionBlock2 = this.LIZ.LLILZLL;
                                if (completionBlock2 != null) {
                                    C2382909Vj.LIZ(completionBlock2, 0, String.valueOf(e.getMessage()), null, 4);
                                    return;
                                }
                                return;
                            }
                        }
                        CompletionBlock<InterfaceC1891280zJe> completionBlock3 = this.LIZ.LLILZLL;
                        if (completionBlock3 != null) {
                            C2382909Vj.LIZ(completionBlock3, -7, "User cancelled", null, 4);
                        }
                    }
                });
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                if (c19egLIZIZ != null) {
                    this.LLILZLL = completionBlock;
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 33) {
                        str = "android.permission.READ_MEDIA_IMAGES";
                    } else {
                        str = "android.permission.WRITE_EXTERNAL_STORAGE";
                    }
                    if (C838410Wul.LIZ(c19egLIZIZ, str) == 0) {
                        LIZLLL();
                        return;
                    }
                    if (i >= 34 && C838410Wul.LIZ(c19egLIZIZ, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
                        LIZLLL();
                        return;
                    }
                    String[] strArr = {str};
                    if (i >= 34) {
                        C13DL.LJIIIIZZ("android.permission.READ_MEDIA_VISUAL_USER_SELECTED", strArr);
                    }
                    C1766710w4j.LIZLLL(C1766710w4j.LIZ, c19egLIZIZ, strArr, new AwS394S0200000_28(this, c19egLIZIZ, 118), null, 8);
                    return;
                }
                return;
            }
            C2382909Vj.LIZ(completionBlock, 0, "Failed to find proper activity", null, 4);
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "Failed to find proper activity", null, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0172 A[PHI: r9
      0x0172: PHI (r9v2 java.lang.String) = (r9v7 java.lang.String), (r9v9 java.lang.String) binds: [B:42:0x00d7, B:70:0x0169] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(android.app.Activity r15, java.util.List<java.lang.String> r16, java.util.List<java.lang.String> r17, java.util.List<java.lang.String> r18) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20149813sm.LIZJ(android.app.Activity, java.util.List, java.util.List, java.util.List):void");
    }
}
