package X;

import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.bytedance.android.livesdk.chatroom.api.UpdateTips;
import com.bytedance.android.livesdk.subscribe.model.RefundInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KGP, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KGP extends C09AY implements Function1<C0KGF, C0KGF> {
    public final /* synthetic */ SubInfo LL;
    public final /* synthetic */ Boolean LLILLJJLI;
    public final /* synthetic */ Boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ RefundInfo LLIZ;
    public final /* synthetic */ Integer LLIZLLLIL;
    public final /* synthetic */ Boolean LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ List<UpdateTips> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KGP(SubInfo subInfo, Boolean bool, Boolean bool2, String str, Boolean bool3, String str2, RefundInfo refundInfo, Integer num, Boolean bool4, String str3, List<UpdateTips> list) {
        super(1);
        this.LL = subInfo;
        this.LLILLJJLI = bool;
        this.LLILLL = bool2;
        this.LLILZ = str;
        this.LLILZIL = bool3;
        this.LLILZLL = str2;
        this.LLIZ = refundInfo;
        this.LLIZLLLIL = num;
        this.LLJ = bool4;
        this.LLJI = str3;
        this.LLJIJIL = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0KGF invoke(C0KGF c0kgf) {
        C0KGF c0kgf2 = c0kgf;
        C514770KGt c514770KGt = c0kgf2.LLILZLL;
        C514770KGt c514770KGt2 = new C514770KGt(c514770KGt.LIZ, c514770KGt.LIZIZ, c514770KGt.LIZJ, c514770KGt.LIZLLL, c514770KGt.LJ, c514770KGt.LJFF, c514770KGt.LJI, c514770KGt.LJII, c514770KGt.LJIIIIZZ, c514770KGt.LJIIIZ, c514770KGt.LJIIJ, c514770KGt.LJIIJJI);
        SubInfo subInfo = this.LL;
        if (subInfo != null) {
            c514770KGt2.LIZ = subInfo;
        }
        Boolean bool = this.LLILLJJLI;
        if (bool != null) {
            c514770KGt2.LIZIZ = bool.booleanValue();
        }
        Boolean bool2 = this.LLILLL;
        if (bool2 != null) {
            c514770KGt2.LIZJ = bool2.booleanValue();
        }
        String str = this.LLILZ;
        if (str != null && str.length() != 0) {
            c514770KGt2.LIZLLL = this.LLILZ;
        }
        Boolean bool3 = this.LLILZIL;
        if (bool3 != null) {
            c514770KGt2.LJ = bool3.booleanValue();
        }
        if (this.LLILZLL.length() > 0) {
            c514770KGt2.LJFF = this.LLILZLL;
        }
        RefundInfo refundInfo = this.LLIZ;
        if (refundInfo != null) {
            c514770KGt2.LJII = refundInfo;
        }
        Integer num = this.LLIZLLLIL;
        if (num != null) {
            c514770KGt2.LJI = num.intValue();
        }
        Boolean bool4 = this.LLJ;
        if (bool4 != null) {
            c514770KGt2.LJIIIIZZ = bool4.booleanValue();
        }
        String str2 = this.LLJI;
        if (str2 != null) {
            c514770KGt2.LJIIIZ = str2;
        }
        List<UpdateTips> list = this.LLJIJIL;
        if (list != null && !list.isEmpty()) {
            c514770KGt2.LJIIJJI = (UpdateTips) ListProtector.get(this.LLJIJIL, 0);
        }
        return C0KGF.LIZ(c0kgf2, null, null, null, null, c514770KGt2, null, null, 479);
    }
}
