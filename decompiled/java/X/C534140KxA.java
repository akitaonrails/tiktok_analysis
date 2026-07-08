package X;

import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.onthisday.OnThisDayTiktokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewImageScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KxA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewImageScene$showAnimateAsync$1$1", f = "PreviewImageScene.kt", l = {}, m = "invokeSuspend")
public final class C534140KxA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PreviewImageScene LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C534140KxA(PreviewImageScene previewImageScene, boolean z, int i, InterfaceC1364105Vn<? super C534140KxA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = previewImageScene;
        this.LLILLJJLI = z;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C534140KxA(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLJFF;
        String strLJFF2;
        final View viewLIZJ;
        int i;
        int i2;
        int i3;
        int i4;
        C1C7U.LIZ("PreviewImageScene@d7e3.showAnimateAsync$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C12WG.LIZIZ(this.LL)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PreviewImageScene@d7e3.showAnimateAsync$1$1");
            return unit;
        }
        InterfaceC568550MRp interfaceC568550MRpLIZ = C568500MRk.LIZ(this.LL.LLJJJJJIL);
        if (interfaceC568550MRpLIZ != null) {
            int i5 = this.LLILLL;
            PreviewImageScene previewImageScene = this.LL;
            if (i5 != 90 && i5 != 270) {
                TikTokMediaModel tikTokMediaModel = previewImageScene.LLJJJIL;
                if (tikTokMediaModel != null) {
                    i3 = tikTokMediaModel.width;
                    i4 = tikTokMediaModel.height;
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                interfaceC568550MRpLIZ.setVideoSize(i3, i4);
            } else {
                TikTokMediaModel tikTokMediaModel2 = previewImageScene.LLJJJIL;
                if (tikTokMediaModel2 != null) {
                    i = tikTokMediaModel2.height;
                    i2 = tikTokMediaModel2.width;
                } else {
                    i = 0;
                    i2 = 0;
                }
                interfaceC568550MRpLIZ.setVideoSize(i, i2);
            }
        }
        if (C530690Krb.LIZJ(this.LL.LLJJJIL)) {
            PreviewImageScene previewImageScene2 = this.LL;
            OnThisDayTiktokMediaModel onThisDayTiktokMediaModel = (OnThisDayTiktokMediaModel) previewImageScene2.LLJJJIL;
            previewImageScene2.LLLLJ(C530830Krp.LIZ(onThisDayTiktokMediaModel), onThisDayTiktokMediaModel.thumbnail, true);
        } else if (this.LL.LLJJJIL instanceof OnThisDayTiktokMediaModel) {
            PreviewImageScene previewImageScene3 = this.LL;
            TikTokMediaModel tikTokMediaModel3 = previewImageScene3.LLJJJIL;
            if (tikTokMediaModel3 != null) {
                strLJFF2 = tikTokMediaModel3.LJFF();
            } else {
                strLJFF2 = null;
            }
            previewImageScene3.LLLLJ(null, strLJFF2, true);
        } else {
            PreviewImageScene previewImageScene4 = this.LL;
            TikTokMediaModel tikTokMediaModel4 = previewImageScene4.LLJJJIL;
            if (tikTokMediaModel4 != null) {
                strLJFF = tikTokMediaModel4.LJFF();
            } else {
                strLJFF = null;
            }
            previewImageScene4.LLLLJ(null, strLJFF, false);
        }
        PreviewImageScene previewImageScene5 = this.LL;
        if (this.LLILLJJLI) {
            InterfaceC568490MRj interfaceC568490MRj = previewImageScene5.LLJJJ;
            if (interfaceC568490MRj != null && (viewLIZJ = interfaceC568490MRj.LIZJ()) != null) {
                C0LD6 c0ld6 = new C0LD6() { // from class: X.0KxB
                    @Override // X.C0LD6
                    public final View LIZ() {
                        return viewLIZJ;
                    }
                };
                InterfaceC568550MRp interfaceC568550MRpLIZ2 = C568500MRk.LIZ(previewImageScene5.LLJJJJJIL);
                if (interfaceC568550MRpLIZ2 != null) {
                    interfaceC568550MRpLIZ2.LIZIZ(c0ld6.LIZIZ(), c0ld6.LIZJ(), new C21567519ar(), previewImageScene5.LLLLIILL());
                }
            }
        } else {
            previewImageScene5.getClass();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PreviewImageScene@d7e3.showAnimateAsync$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
