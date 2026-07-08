package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OOz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.BulletinPublishManager$shareToBulletinBoard$1", f = "BulletinPublishManager.kt", l = {903, 909}, m = "invokeSuspend")
public final class C618830OOz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C19EG LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ LifecycleOwner LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ Function1<HashMap<String, String>, Unit> LLIZ;
    public final /* synthetic */ BaseSharePackage LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ Aweme LLJIJIL;
    public final /* synthetic */ boolean LLJILJIL;
    public final /* synthetic */ int LLJILJILJ;
    public final /* synthetic */ String LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C618830OOz(LifecycleOwner lifecycleOwner, String str, int i, Function1<? super HashMap<String, String>, Unit> function1, BaseSharePackage baseSharePackage, String str2, String str3, Aweme aweme, boolean z, int i2, String str4, InterfaceC1364105Vn<? super C618830OOz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = lifecycleOwner;
        this.LLILZIL = str;
        this.LLILZLL = i;
        this.LLIZ = function1;
        this.LLIZLLLIL = baseSharePackage;
        this.LLJ = str2;
        this.LLJI = str3;
        this.LLJIJIL = aweme;
        this.LLJILJIL = z;
        this.LLJILJILJ = i2;
        this.LLJILLL = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C618830OOz c618830OOz = new C618830OOz(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, interfaceC1364105Vn);
        c618830OOz.LLILLL = obj;
        return c618830OOz;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fb, code lost:
    
        if (r1.equals("aweme") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0104, code lost:
    
        if (r1.equals("aweme_photo") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0131, code lost:
    
        r3 = X.C0OP0.Companion;
        r2 = r22.LLIZLLLIL.extras.getInt("share_source");
        r19 = X.C0OP0.UNKNOWN;
        r3.getClass();
        r0 = X.C0OP0.typeCache.get(java.lang.Integer.valueOf(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x014e, code lost:
    
        if (r0 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0150, code lost:
    
        r0 = X.C2187451AjH.LIZ;
        r1 = X.C2188811AlT.LIZ();
        r1.append("from unknown type = ");
        r1.append(r2);
        X.C1720106oR.LJI("BulletinItemCreateSource", X.C2188811AlT.LIZIZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0167, code lost:
    
        r2 = new java.util.LinkedHashMap();
        r2.put("channel_id", r22.LLILZIL);
        r1 = r22.LLJI;
        r3 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0177, code lost:
    
        if (r1 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0179, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x017a, code lost:
    
        r2.put("enter_from", r1);
        r1 = r22.LLJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0181, code lost:
    
        if (r1 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0183, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0184, code lost:
    
        r2.put("entrance_page", r1);
        r0 = X.C0OP1.LIZ[r19.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0191, code lost:
    
        if (r0 == 1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0193, code lost:
    
        if (r0 == 2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0195, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0196, code lost:
    
        r2.put("enter_method", r1);
        r2.put("content_type", "post");
        r2.put("is_resend", com.ss.android.ugc.aweme.feed.model.CardStruct.IStatusCode.DEFAULT);
        r0 = r22.LLJIJIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ab, code lost:
    
        if (r0 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01ad, code lost:
    
        r0 = r0.getAid();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01b1, code lost:
    
        if (r0 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01b3, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01b4, code lost:
    
        r2.put("group_id", r3);
        r0 = r22.LLJIJIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01bb, code lost:
    
        if (r0 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01bd, code lost:
    
        r1 = r22.LLILZIL;
        X.C0OOY.LJIILL(X.C0OOY.LIZ, r1, r0, r2, r19, null, 16);
        X.C0OPQ.LIZ.getClass();
        X.C0OPQ.LJJJ(r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01d6, code lost:
    
        r15 = X.EnumC618610OOd.SUCCESS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01da, code lost:
    
        X.C0OPX.LJIIIIZZ("shareToBulletinBoard aweme is null");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01e0, code lost:
    
        r1 = "post_guided_share";
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01e3, code lost:
    
        r1 = "post_auto_share";
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e6, code lost:
    
        r19 = r0;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C618830OOz.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
