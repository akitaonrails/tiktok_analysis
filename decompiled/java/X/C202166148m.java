package X;

import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.148m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202166148m extends AbstractC202165148l {
    public String LLIZ;
    public boolean LLIZLLLIL;
    public String LLJ;

    public C202166148m() {
        this(null, false, null);
    }

    @Override // X.AbstractC202165148l
    public int getEventLimits() {
        return 6000;
    }

    @Override // X.AbstractC202165148l
    public String getServiceType() {
        return "sms";
    }

    @Override // X.AbstractC202165148l
    public int getType() {
        return 1;
    }

    public final String getScene() {
        return this.LLIZ;
    }

    public final boolean getShowToastSuccess() {
        return this.LLIZLLLIL;
    }

    public final String getUid() {
        return this.LLJ;
    }

    @Override // X.AbstractC202165148l
    public void buildUrl(StringBuilder sb) {
        C148N.LIZIZ(sb, Scene.SCENE_SERVICE, this.LLIZ);
        C148N.LIZ(sb, "show_success_toast", this.LLIZLLLIL ? 1 : 0);
        C148N.LIZIZ(sb, "uid", this.LLJ);
    }

    public final void setScene(String str) {
        this.LLIZ = str;
    }

    public final void setShowToastSuccess(boolean z) {
        this.LLIZLLLIL = z;
    }

    public final void setUid(String str) {
        this.LLJ = str;
    }

    public C202166148m(String str, boolean z) {
        this(null, false, null);
        this.LLIZ = str;
        this.LLIZLLLIL = z;
    }

    public C202166148m(String str, boolean z, String str2) {
        this.LLIZ = str;
        this.LLIZLLLIL = z;
        this.LLJ = str2;
        setFullscreen(true);
    }
}
