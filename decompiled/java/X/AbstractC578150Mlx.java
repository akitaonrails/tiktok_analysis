package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0Mlx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC578150Mlx implements InterfaceC578210Mm3 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C1DRG LL;
    public final C1664750tQH LLILLJJLI;
    public final C1664750tQH LLILLL;
    public final C1664750tQH LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 136));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbstractC578150Mlx.class, "imageEditPageData", "getImageEditPageData()Lcom/ss/android/ugc/aweme/image/switchmode/ImageEditPageData;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AbstractC578150Mlx.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(AbstractC578150Mlx.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public abstract void LJ(Bundle bundle, C578160Mly c578160Mly, InterfaceC332260D0u<EnumC578300MmC> interfaceC332260D0u);

    public abstract Bundle LJFF();

    public abstract void LJI();

    public final Bundle LIZ() {
        return (Bundle) this.LLILZIL.getValue();
    }

    public final VideoPublishEditModel LIZIZ() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLILZLL[1]);
    }

    public final C1439810nZT LIZJ() {
        return (C1439810nZT) this.LLILLJJLI.getValue(this, LLILZLL[0]);
    }

    public final AbstractC214814194y LIZLLL() {
        return (AbstractC214814194y) this.LLILZ.getValue(this, LLILZLL[2]);
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC578210Mm3
    public void init() {
        LIZ();
    }

    public AbstractC578150Mlx(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = C1664770tQJ.LIZ(c1drg, C1439810nZT.class, null);
        this.LLILLL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLILZ = C1664770tQJ.LIZ(c1drg, AbstractC214814194y.class, null);
    }

    @Override // X.InterfaceC578210Mm3
    public final void Yw2(C578160Mly c578160Mly, InterfaceC332260D0u<EnumC578300MmC> interfaceC332260D0u) {
        LJI();
        LJ(LJFF(), c578160Mly, interfaceC332260D0u);
    }
}
