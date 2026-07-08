package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSettingList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NoM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel$submitTasks$4", f = "BulletinProfileViewModel.kt", l = {534}, m = "invokeSuspend")
public final class C605120NoM extends C09AX implements Function2<String, InterfaceC1364105Vn<? super BulletinSettingList>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0OIU LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C605120NoM(C0OIU c0oiu, InterfaceC1364105Vn<? super C605120NoM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0oiu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C605120NoM c605120NoM = new C605120NoM(this.LLILLL, interfaceC1364105Vn);
        c605120NoM.LLILLJJLI = obj;
        return c605120NoM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinProfileViewModel@3b06.submitTasks$4");
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
            String str = (String) this.LLILLJJLI;
            C0OIU c0oiu = this.LLILLL;
            this.LL = 1;
            obj = c0oiu.LLJIJIL(str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BulletinProfileViewModel@3b06.submitTasks$4");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("BulletinProfileViewModel@3b06.submitTasks$4");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, InterfaceC1364105Vn<? super BulletinSettingList> interfaceC1364105Vn) {
        return ((a) create(str, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
