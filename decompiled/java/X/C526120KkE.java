package X;

import Y.AComparatorS22S0000000_3;
import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditPhotoModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.creative.model.event.EventData;
import com.ss.android.ugc.aweme.creative.model.grid.QuickGridModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS239S0000000_8;

/* JADX INFO: renamed from: X.0KkE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C526120KkE extends AbstractC2255721DQs<InterfaceC525680KjW> implements InterfaceC525680KjW, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final C1DRG LL;
    public final InterfaceC525680KjW LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC525880Kjq.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), Bundle.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), ShortVideoContext.class, null);
    public final List<InterfaceC2495909qH> LLIZ = new ArrayList();
    public final C05YC<Object> LLIZLLLIL;
    public final InterfaceC346201Wa<Object> LLJ;
    public final C05YC<InterfaceC2499409qq> LLJI;
    public final InterfaceC346201Wa<InterfaceC2499409qq> LLJIJIL;
    public C09AE LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C526120KkE.class, "selectionDataApi", "getSelectionDataApi()Lcom/ss/android/ugc/aweme/shortvideo/album/selection/AlbumSelectionDataApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C526120KkE.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C526120KkE.class, "arguments", "getArguments()Landroid/os/Bundle;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C526120KkE.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        c09r3.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    private final Bundle X1() {
        return (Bundle) this.LLILZIL.getValue(this, LLJILJILJ[2]);
    }

    private final InterfaceC525880Kjq Z1() {
        return (InterfaceC525880Kjq) this.LLILLL.getValue(this, LLJILJILJ[0]);
    }

    private final C19EG getActivity() {
        return (C19EG) this.LLILZ.getValue(this, LLJILJILJ[1]);
    }

    private final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLILZLL.getValue(this, LLJILJILJ[3]);
    }

    public final CreativeLoadingDialog w2() {
        C19576911iZ c19576911iZ = C19576911iZ.LIZ;
        C19EG activity = getActivity();
        CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
        creativeLoadingDialogBuilder.showProgress(false);
        creativeLoadingDialogBuilder.backCanCancel(false);
        creativeLoadingDialogBuilder.cancelViewVisibleType(CreativeLoadingDialogBuilder.CancelType.VISIBLE_AFTER_5S);
        creativeLoadingDialogBuilder.loadingMessage(getActivity().getString(R.string.txr));
        creativeLoadingDialogBuilder.clickCancelListener(AFwS239S0000000_8.get$arr$(61));
        creativeLoadingDialogBuilder.dismissListener(new DialogInterfaceOnDismissListenerC580970MqV(this, 1));
        CreativeLoadingDialog creativeLoadingDialogCreateLoadingDialog = c19576911iZ.createLoadingDialog(activity, 1024, creativeLoadingDialogBuilder);
        ((CreativeDialogWrapper) creativeLoadingDialogCreateLoadingDialog).delayShow(300L);
        return creativeLoadingDialogCreateLoadingDialog;
    }

    private final void o2() {
        CreativeInfo creativeInfoLIZIZ;
        CreativeModel creativeModel;
        LivePhotoModel livePhotoModel;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        if (shortVideoContext == null || (creativeInfoLIZIZ = shortVideoContext.creativeInfo) == null) {
            creativeInfoLIZIZ = C537520L6g.LIZIZ(X1());
        }
        pB1(new InterfaceC2495909qH() { // from class: X.09qn
            @Override // X.InterfaceC2495909qH
            public final int getPriority() {
                return 50;
            }

            @Override // X.InterfaceC2495909qH
            public final Object LJLIIIL(C525700KjY c525700KjY, InterfaceC2495009q8 interfaceC2495009q8, InterfaceC1364105Vn<? super InterfaceC2499409qq> interfaceC1364105Vn) {
                c525700KjY.LJ.putExtra("key_choose_media_data", new ArrayList(c525700KjY.LIZ));
                c525700KjY.LJ.putExtra("key_short_video_context", c525700KjY.LIZLLL);
                return ((C2499209qo) interfaceC2495009q8).LIZ(c525700KjY, interfaceC1364105Vn);
            }
        });
        pB1(new C345340DgK(new C526700KlA(getActivity(), false), 100, getDiContainer()));
        pB1(new C2494909q7(getActivity()));
        pB1(new C345340DgK(new C535450KzH(), 200, getDiContainer()));
        pB1(new InterfaceC2495909qH() { // from class: X.0KkF
            @Override // X.InterfaceC2495909qH
            public final int getPriority() {
                return 400;
            }

            @Override // X.InterfaceC2495909qH
            public final Object LJLIIIL(C525700KjY c525700KjY, InterfaceC2495009q8 interfaceC2495009q8, InterfaceC1364105Vn<? super InterfaceC2499409qq> interfaceC1364105Vn) {
                boolean z;
                EditPhotoModel editPhotoModel;
                boolean z2;
                EventData eventData;
                String str;
                QuickGridModel quickGridModel;
                boolean z3;
                EditorProModel editorProModel;
                C0L99 c0l99 = c525700KjY.LIZIZ;
                if (c0l99 == C0L99.EDITOR_PRO) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z4 = c525700KjY.LIZJ;
                ShortVideoContext shortVideoContext2 = c525700KjY.LIZLLL;
                if (shortVideoContext2 != null) {
                    CreativeFlowData creativeFlowData = shortVideoContext2.creativeFlowData;
                    if (creativeFlowData != null) {
                        if (creativeFlowData.getEditorProModel() == null) {
                            creativeFlowData.setEditorProModel(new EditorProModel(false, null, false, false, "", false, 0L, null, null, false, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), false, false, false, 0, false, false, false, false, 0, false, false, null, false, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), z, -1, -1, "", false, false, null, null, new ArrayList(), null, new ArrayList(), new ArrayList(), new ArrayList(), new LinkedHashMap(), new ArrayList(), new ArrayList(), new ArrayList(), null, null, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), null, new ArrayList(), new ConcurrentHashMap(), new ArrayList(), false, false, "", false, -1L, false, null));
                        } else {
                            EditorProModel editorProModel2 = creativeFlowData.getEditorProModel();
                            if (editorProModel2 != null) {
                                editorProModel2.setFromEditorProEntranceInAlbum(z);
                            }
                        }
                        if (z && (editorProModel = creativeFlowData.getEditorProModel()) != null) {
                            editorProModel.setFromAlbumType(z4 ? 1 : 0);
                        }
                    }
                    if (shortVideoContext2 != null) {
                        CreativeModel creativeModel2 = shortVideoContext2.creativeModel;
                        if (creativeModel2 != null && (quickGridModel = creativeModel2.quickGridModel) != null) {
                            if (c0l99 == C0L99.ALBUM_GRID) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            quickGridModel.isFromQuickGrid = z3;
                        }
                        CreativeModel creativeModel3 = shortVideoContext2.creativeModel;
                        if (creativeModel3 != null && (eventData = creativeModel3.eventData) != null) {
                            if (z) {
                                str = "edit";
                            } else {
                                str = "next";
                            }
                            eventData.fromAlbumBottomBtn = str;
                        }
                        CreativeModel creativeModel4 = shortVideoContext2.creativeModel;
                        if (creativeModel4 != null && (editPhotoModel = creativeModel4.editPhotoModel) != null) {
                            if (c0l99 == C0L99.EDIT_PHOTO) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            editPhotoModel.isFromEditPhoto = z2;
                        }
                    }
                }
                C524780Ki4.LIZ.start("av_video_edit", "click onNext btn");
                if (!c525700KjY.LIZ.isEmpty()) {
                    List<TikTokMediaModel> list = c525700KjY.LIZ;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        C524780Ki4.LIZ.start("av_image_edit", "click onNext btn");
                    } else {
                        Iterator<TikTokMediaModel> it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (!(!it2.next().LJIILJJIL())) {
                                break;
                            }
                        }
                        C524780Ki4.LIZ.start("av_image_edit", "click onNext btn");
                    }
                }
                if (C298330Bmh.LIZ()) {
                    C524780Ki4.LIZ.start("av_video_editor_init", "click onNext btn");
                }
                return ((C2499209qo) interfaceC2495009q8).LIZ(c525700KjY, interfaceC1364105Vn);
            }
        });
        ShortVideoContext shortVideoContext2 = getShortVideoContext();
        pB1(new C345340DgK((shortVideoContext2 == null || (creativeModel = shortVideoContext2.creativeModel) == null || (livePhotoModel = creativeModel.livePhotoModel) == null || !livePhotoModel.enableLiveMode) ? new C524220KhA(creativeInfoLIZIZ) : new C524210Kh9(), 600, getDiContainer()));
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        o2();
    }

    public InterfaceC525680KjW W1() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC525680KjW
    public InterfaceC346201Wa<InterfaceC2499409qq> Ya0() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC525680KjW
    public InterfaceC346201Wa<Object> op() {
        return this.LLJ;
    }

    public C526120KkE(C1DRG c1drg) {
        this.LL = c1drg;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
        this.LLIZLLLIL = c2252331DDrLIZIZ;
        this.LLJ = C09IC.LIZ(c2252331DDrLIZIZ);
        C2252331DDr c2252331DDrLIZIZ2 = C09IR.LIZIZ(0, 0, null, 7);
        this.LLJI = c2252331DDrLIZIZ2;
        this.LLJIJIL = C09IC.LIZ(c2252331DDrLIZIZ2);
    }

    @Override // X.InterfaceC525680KjW
    public void oa1(InterfaceC2495909qH interfaceC2495909qH) {
        this.LLIZ.remove(interfaceC2495909qH);
    }

    @Override // X.InterfaceC525680KjW
    public void pB1(InterfaceC2495909qH interfaceC2495909qH) {
        this.LLIZ.add(interfaceC2495909qH);
        List<InterfaceC2495909qH> list = this.LLIZ;
        if (list.size() > 1) {
            C08XD.LJJ(list, new AComparatorS22S0000000_3(6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    @Override // X.InterfaceC525680KjW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void qM0(X.C0L99 r12, boolean r13, kotlin.jvm.functions.Function1<? super X.C525700KjY, X.C525700KjY> r14) {
        /*
            r11 = this;
            X.09AE r0 = r11.LLJILJIL
            if (r0 == 0) goto L1c
            boolean r1 = r0.isActive()
            r0 = 1
            if (r1 != r0) goto L1c
        Lb:
            r4 = 3
            r3 = 0
            if (r0 == 0) goto L1e
            androidx.lifecycle.LifecycleCoroutineScope r1 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r11)
            X.0Kkb r0 = new X.0Kkb
            r0.<init>(r11, r3)
            X.C23250099c.LIZLLL(r1, r3, r3, r0, r4)
            return
        L1c:
            r0 = 0
            goto Lb
        L1e:
            X.0KjY r5 = new X.0KjY
            X.0Kjq r0 = r11.Z1()
            java.util.List r6 = r0.m02()
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r9 = r11.getShortVideoContext()
            android.content.Intent r10 = new android.content.Intent
            r10.<init>()
            r8 = r13
            r7 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r2 = r14.invoke(r5)
            X.0KjY r2 = (X.C525700KjY) r2
            androidx.lifecycle.LifecycleCoroutineScope r1 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r11)
            X.0KkL r0 = new X.0KkL
            r0.<init>(r11, r2, r3)
            X.0956 r0 = X.C23250099c.LIZLLL(r1, r3, r3, r0, r4)
            r11.LLJILJIL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C526120KkE.qM0(X.0L99, boolean, kotlin.jvm.functions.Function1):void");
    }
}
