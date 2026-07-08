package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0e50, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.contact.uploader.ContactUploader", f = "ContactUploader.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "upload")
public final class C1074960e50 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1074950e4z LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1074960e50(C1074950e4z c1074950e4z, InterfaceC1364105Vn<? super C1074960e50> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1074950e4z;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ContactUploader@b372.upload$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("ContactUploader@b372.upload$1");
        return objLIZ;
    }
}
