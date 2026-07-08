package X;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Base64;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.dependency.log.LogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.140x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C201969140x extends AbstractC539760LEw<List<? extends AnonymousClass1410>> {
    public final CompletionBlock<InterfaceC201971140z> LIZ;
    public Float LIZIZ = Float.valueOf(1.0f);

    @Override // X.AbstractC539760LEw
    public final void LIZ() {
    }

    @Override // X.AbstractC539760LEw
    public final void LIZIZ() {
    }

    public C201969140x(CompletionBlock<InterfaceC201971140z> completionBlock) {
        this.LIZ = completionBlock;
    }

    @Override // X.AbstractC539760LEw
    public final void LIZJ(Object obj) throws Throwable {
        String strEncodeToString;
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        int iFloatValue;
        List<AnonymousClass1410> list = (List) obj;
        CompletionBlock<InterfaceC201971140z> completionBlock = this.LIZ;
        ArrayList arrayList = null;
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC201971140z.class, null);
        InterfaceC201971140z interfaceC201971140z = (InterfaceC201971140z) xBaseModelLIZJ;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (AnonymousClass1410 anonymousClass1410 : list) {
                String str = anonymousClass1410.LJFF;
                if (C770702zh.LIZ(str) && new C0VSJ(anonymousClass1410.LJFF).exists()) {
                    try {
                        Bitmap bitmapDecodeBitmap = BitmapUtils.decodeBitmap(new C0VSJ(str));
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                        if (Intrinsics.LJFF(C13LP.LJJLIIIJJI(a0.LJJLIIIJ(anonymousClass1410.LJI, new char[]{'/'}, true, 0, 4)), "jpeg")) {
                            compressFormat = Bitmap.CompressFormat.JPEG;
                        } else if (Intrinsics.LJFF(C13LP.LJJLIIIJJI(a0.LJJLIIIJ(anonymousClass1410.LJI, new char[]{'/'}, true, 0, 4)), "png")) {
                            compressFormat = Bitmap.CompressFormat.PNG;
                        }
                        Float f = this.LIZIZ;
                        if (f != null) {
                            iFloatValue = (int) (f.floatValue() * 100.0f);
                        } else {
                            iFloatValue = 100;
                        }
                        bitmapDecodeBitmap.compress(compressFormat, iFloatValue, byteArrayOutputStream);
                        strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        strEncodeToString = null;
                    }
                } else {
                    strEncodeToString = null;
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJ(Boolean.valueOf(new C0VSJ(anonymousClass1410.LIZ).exists()), "origin_path_exist");
                c2344009Gk.LJ(Boolean.valueOf(new C0VSJ(anonymousClass1410.LIZIZ).exists()), "compress_path_exist");
                c2344009Gk.LJ(anonymousClass1410.LIZJ, "origin_file_size");
                c2344009Gk.LIZLLL(anonymousClass1410.LIZLLL, "compress_file_size");
                c2344009Gk.LJFF("media_type", anonymousClass1410.LJ);
                c2344009Gk.LJ(Boolean.valueOf(new C0VSJ(anonymousClass1410.LJFF).exists()), "base64_path_exist");
                c2344009Gk.LJ(Boolean.valueOf(C770702zh.LIZ(strEncodeToString)), "compress_base64_exist");
                c2344009Gk.LJFF("mime_type", anonymousClass1410.LJI);
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String name2 = ILogDependencyService.class.getName();
                    if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                        name = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
                }
                ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).onEventV3("ec_choose_media_method", c2344009Gk.LIZ);
                String str2 = null;
                InterfaceC201970140y interfaceC201970140y = (InterfaceC201970140y) C1909107dp.LIZJ(InterfaceC201970140y.class, null);
                if (C770702zh.LIZ(anonymousClass1410.LIZIZ) && new C0VSJ(anonymousClass1410.LIZIZ).exists()) {
                    str2 = anonymousClass1410.LIZIZ;
                }
                interfaceC201970140y.setFilePath(str2);
                if (Intrinsics.LJFF(anonymousClass1410.LJ, "photo")) {
                    interfaceC201970140y.setMediaType(1);
                } else if (Intrinsics.LJFF(anonymousClass1410.LJ, "video")) {
                    interfaceC201970140y.setMediaType(2);
                }
                interfaceC201970140y.setSize(Long.valueOf(anonymousClass1410.LIZLLL));
                interfaceC201970140y.setBase64Data(strEncodeToString);
                interfaceC201970140y.setMimeType(anonymousClass1410.LJI);
                interfaceC201970140y.setIdentifier(anonymousClass1410.LIZ);
                arrayList.add(interfaceC201970140y);
            }
        }
        interfaceC201971140z.setFiles(arrayList);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
