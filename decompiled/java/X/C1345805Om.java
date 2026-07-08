package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Om, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.landscape.repos.LandscapeFeedRepo$operator$1$getVideoList$2", f = "LandscapeFeedRepo.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITH_TEXT, LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT}, m = "invokeSuspend")
public final class C1345805Om extends C09AX implements Function2<InterfaceC346701Wf<? super C1346005Oo>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1345805Om(long j, InterfaceC1364105Vn<? super C1345805Om> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1345805Om c1345805Om = new C1345805Om(this.LLILLL, interfaceC1364105Vn);
        c1345805Om.LLILLJJLI = obj;
        return c1345805Om;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346701Wf interfaceC346701Wf;
        List listSubList;
        C1346005Oo c1346005Oo;
        C1C7U.LIZ("LandscapeFeedRepo@b1d9.operator$1$getVideoList$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("LandscapeFeedRepo@b1d9.operator$1$getVideoList$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            this.LLILLJJLI = interfaceC346701Wf;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(2000L, this) == objLJFF) {
                C1C7U.LIZIZ("LandscapeFeedRepo@b1d9.operator$1$getVideoList$2");
                return objLJFF;
            }
        }
        long j = this.LLILLL;
        long j2 = C1345905On.LIZ;
        ArrayList arrayList = (ArrayList) C1345905On.LIZIZ;
        if (j2 >= arrayList.size()) {
            c1346005Oo = new C1346005Oo(new ArrayList(), false);
        } else {
            if (j < arrayList.size()) {
                listSubList = arrayList.subList((int) C1345905On.LIZ, (int) j);
            } else {
                listSubList = arrayList.subList((int) C1345905On.LIZ, arrayList.size());
            }
            if (j >= arrayList.size()) {
                z = false;
            }
            C1345905On.LIZ = j;
            c1346005Oo = new C1346005Oo(listSubList, z);
        }
        this.LLILLJJLI = null;
        this.LL = 2;
        if (interfaceC346701Wf.emit(c1346005Oo, this) == objLJFF) {
            C1C7U.LIZIZ("LandscapeFeedRepo@b1d9.operator$1$getVideoList$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LandscapeFeedRepo@b1d9.operator$1$getVideoList$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C1346005Oo> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
