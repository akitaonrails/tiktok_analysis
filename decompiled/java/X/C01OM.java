package X;

import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01OM, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.utils.InteractTextParseUtils$fetchImages$2", f = "InteractTextParseUtils.kt", l = {131}, m = "invokeSuspend")
public final class C01OM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Text LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01OM(Text text, InterfaceC1364105Vn<? super C01OM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = text;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01OM c01om = new C01OM(this.LLILLL, interfaceC1364105Vn);
        c01om.LLILLJJLI = obj;
        return c01om;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InteractTextParseUtils@d546.fetchImages$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            List<TextPiece> list = this.LLILLL.pieces;
            ArrayList arrayList = new ArrayList();
            for (TextPiece textPiece : list) {
                if (textPiece.type == EnumC1133850fbz.IMAGE.getPieceType()) {
                    arrayList.add(textPiece);
                }
            }
            if (arrayList.isEmpty()) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("InteractTextParseUtils@d546.fetchImages$2");
                return unit;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchImages total = ");
            sbLIZ.append(arrayList.size());
            C20441214yg.LJIIIZ("InteractTextParseUtils", C2188811AlT.LIZIZ(sbLIZ));
            IHostFrescoHelper iHostFrescoHelper = (IHostFrescoHelper) C1161920gLG.LIZJ(IHostFrescoHelper.class);
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(C23250099c.LIZLLL(interfaceC497601wk, null, null, new C469201sA((TextPiece) it2.next(), iHostFrescoHelper, null), 3));
            }
            this.LL = 1;
            if (C1D9F.LIZJ(arrayList2, this) == objLJFF) {
                C1C7U.LIZIZ("InteractTextParseUtils@d546.fetchImages$2");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("InteractTextParseUtils@d546.fetchImages$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
