package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0HOU, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.ids.IdState$Companion$combineAndWrapCreated$$inlined$combine$1$3", f = "IdData.kt", l = {292}, m = "invokeSuspend")
public final class C0HOU extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super C0HOM<? extends List<Object>>>, C0HOM<Object>[], InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC346701Wf LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ List LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HOU(InterfaceC1364105Vn interfaceC1364105Vn, List list) {
        super(3, interfaceC1364105Vn);
        this.LLILZ = list;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super C0HOM<? extends List<Object>>> interfaceC346701Wf, C0HOM<Object>[] c0homArr, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C0HOU c0hou = new C0HOU(interfaceC1364105Vn, this.LLILZ);
        c0hou.LLILLJJLI = interfaceC346701Wf;
        c0hou.LLILLL = c0homArr;
        return c0hou.invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0HOM c1372405Ys;
        C1372405Ys c1372405Ys2;
        T t;
        C1C7U.LIZ("IdState$Companion@96e8.combineAndWrapCreated$$inlined$combine$1$3");
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
            InterfaceC346701Wf interfaceC346701Wf = this.LLILLJJLI;
            C0HOM[] c0homArr = (C0HOM[]) ((Object[]) this.LLILLL);
            ArrayList arrayList = new ArrayList();
            for (C0HOM c0hom : c0homArr) {
                if ((c0hom instanceof C1372405Ys) && (c1372405Ys2 = (C1372405Ys) c0hom) != null && (t = c1372405Ys2.LIZIZ) != 0) {
                    arrayList.add(t);
                }
            }
            if (arrayList.size() == this.LLILZ.size()) {
                c1372405Ys = new C1372405Ys(arrayList);
            } else {
                c1372405Ys = C0HON.LIZIZ;
            }
            this.LL = 1;
            if (interfaceC346701Wf.emit(c1372405Ys, this) == objLJFF) {
                C1C7U.LIZIZ("IdState$Companion@96e8.combineAndWrapCreated$$inlined$combine$1$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IdState$Companion@96e8.combineAndWrapCreated$$inlined$combine$1$3");
        return unit;
    }
}
