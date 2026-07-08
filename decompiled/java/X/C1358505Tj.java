package X;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Tj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.customize.ui.CustomizeStyleTemplatesKt$CustomizeStyleTemplates$scrollTileIntoView$1$1$1", f = "CustomizeStyleTemplates.kt", l = {205}, m = "invokeSuspend")
public final class C1358505Tj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1690080u58 LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1358505Tj(C1690080u58 c1690080u58, int i, int i2, InterfaceC1364105Vn<? super C1358505Tj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1690080u58;
        this.LLILLL = i;
        this.LLILZ = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1358505Tj(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C06XG next;
        int i;
        Object objLIZ;
        C1C7U.LIZ("CustomizeStyleTemplatesKt@41ae.CustomizeStyleTemplates$scrollTileIntoView$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1690080u58 c1690080u58 = this.LLILLJJLI;
            int i3 = this.LLILLL;
            int i4 = this.LLILZ;
            this.LL = 1;
            Iterator<C06XG> it2 = c1690080u58.LJIIIZ().LJII().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.getIndex() == i3) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C06XG c06xg = next;
            if (c06xg == null) {
                objLIZ = Unit.LIZ;
            } else {
                int offset = c06xg.getOffset();
                int offset2 = c06xg.getOffset() + c06xg.getSize();
                int iLIZLLL = c1690080u58.LJIIIZ().LIZLLL() + i4;
                int iLIZIZ = c1690080u58.LJIIIZ().LIZIZ() - i4;
                if (offset < iLIZLLL) {
                    i = offset - iLIZLLL;
                } else {
                    if (offset2 > iLIZIZ) {
                        i = offset2 - iLIZIZ;
                    }
                    objLIZ = Unit.LIZ;
                }
                if (i == 0 || (objLIZ = C1392905cl.LIZ(c1690080u58, i, C1671550tbF.LIZJ(0.0f, 0.0f, null, 7), this)) != C099R.LJFF()) {
                    objLIZ = Unit.LIZ;
                }
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("CustomizeStyleTemplatesKt@41ae.CustomizeStyleTemplates$scrollTileIntoView$1$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CustomizeStyleTemplatesKt@41ae.CustomizeStyleTemplates$scrollTileIntoView$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
