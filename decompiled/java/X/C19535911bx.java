package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import njp.a;

/* JADX INFO: renamed from: X.11bx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.vc.handlers.MuteCheckHandler$handleData$2", f = "MuteCheckHandler.kt", l = {22}, m = "invokeSuspend")
public final class C19535911bx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ C19536911c7 LLILLJJLI;
    public final /* synthetic */ C19536011by LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19535911bx(C19536911c7 c19536911c7, C19536011by c19536011by, InterfaceC1364105Vn<? super C19535911bx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19536911c7;
        this.LLILLL = c19536011by;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19535911bx(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZ;
        String strLIZ2;
        C1C7U.LIZ("MuteCheckHandler@e389.handleData$2");
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
            C19536911c7 c19536911c7 = this.LLILLJJLI;
            List<C19536311c1> list = c19536911c7.LIZLLL;
            C19536011by c19536011by = this.LLILLL;
            AwS608S0100000_29 awS608S0100000_29 = new AwS608S0100000_29(c19536911c7, 861);
            AFwS273S0000000_29 aFwS273S0000000_29 = AFwS273S0000000_29.get$arr$(472);
            this.LL = 1;
            c19536011by.getClass();
            obj = C2296808zG.LJ(new C353090Dsp(list, awS608S0100000_29, aFwS273S0000000_29, null), this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MuteCheckHandler@e389.handleData$2");
                return objLJFF;
            }
        }
        ArrayList arrayList = new ArrayList();
        C19536911c7 c19536911c72 = this.LLILLJJLI;
        C19536011by c19536011by2 = this.LLILLL;
        int i2 = 0;
        for (Object obj2 : (List) obj) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C1433070nOb c1433070nOb = (C1433070nOb) obj2;
                C19536311c1 c19536311c1 = (C19536311c1) ListProtector.get(c19536911c72.LIZLLL, i2);
                if (c19536311c1.LIZIZ == null) {
                    c19536911c72.LJIIJ.LJFF = true;
                } else {
                    c19536911c72.LJIIJ.LJ = true;
                }
                if (c1433070nOb != null && c1433070nOb.LIZ) {
                    arrayList.add(c19536311c1);
                    C19538011cI c19538011cI = c19536911c72.LJIIIZ;
                    if (c19538011cI != null && (strLIZ2 = C349090DmN.LIZ(c19536311c1)) != null) {
                        c19538011cI.LIZ.put(strLIZ2, Boolean.TRUE);
                    }
                } else {
                    c19536311c1.LJIILIIL = "muted_video";
                    c19536311c1.LJIIL = -1;
                    c19536011by2.getClass();
                    c19536311c1.LJIILJJIL = 1;
                    C19533811bc c19533811bc = c19536911c72.LJIIJ;
                    c19533811bc.LJI = c19536311c1.LJIIL;
                    c19533811bc.LJII = c19536311c1.LJIILIIL;
                    C19538011cI c19538011cI2 = c19536911c72.LJIIIZ;
                    if (c19538011cI2 != null && (strLIZ = C349090DmN.LIZ(c19536311c1)) != null) {
                        c19538011cI2.LIZ.put(strLIZ, Boolean.FALSE);
                    }
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        this.LLILLJJLI.LJFF = arrayList;
        Boolean boolValueOf = Boolean.valueOf(!arrayList.isEmpty());
        C1C7U.LIZIZ("MuteCheckHandler@e389.handleData$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
