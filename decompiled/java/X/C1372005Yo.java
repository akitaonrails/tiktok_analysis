package X;

import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.socialavatar.api.BatchSocialAvatarService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Yo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.ids.FriendsSocialAvatarIdData$1", f = "FriendsSocialAvatarIdData.kt", l = {54, DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE, 74}, m = "invokeSuspend")
public final class C1372005Yo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public BatchSocialAvatarService LL;
    public Object LLILLJJLI;
    public C013C LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C1372205Yq LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1372005Yo(C1372205Yq c1372205Yq, boolean z, InterfaceC1364105Vn<? super C1372005Yo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c1372205Yq;
        this.LLIZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1372005Yo c1372005Yo = new C1372005Yo(this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1372005Yo.LLILZIL = obj;
        return c1372005Yo;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01bf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x01bd -> B:8:0x0027). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1372005Yo.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
