package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01jn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.component.StoryCelebrationMentionStickerComponent$onMessageReceived$1", f = "StoryCelebrationMentionStickerComponent.kt", l = {}, m = "invokeSuspend")
public final class C417301jn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C19611611oA LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C417301jn(int i, int i2, int i3, String str, C19611611oA c19611611oA, InterfaceC1364105Vn<? super C417301jn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = str;
        this.LLILZIL = c19611611oA;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C417301jn(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryCelebrationMentionStickerComponent@4bed.onMessageReceived$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(" 36865 ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLILZ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LL == 36865) {
            String str = this.LLILZ;
            if (str == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("StoryCelebrationMentionStickerComponent@4bed.onMessageReceived$1");
                return unit;
            }
            this.LLILZIL.Z1(str);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StoryCelebrationMentionStickerComponent@4bed.onMessageReceived$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
