package X;

import android.content.Context;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01s4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.share.MixStudioShareServiceImpl$generateStoryImageAndBackground$2$bgPathDeferred$1", f = "MixStudioShareServiceImpl.kt", l = {35}, m = "invokeSuspend")
public final class C468601s4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C468601s4(int i, Context context, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = str;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C468601s4(this.LLILZ, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixStudioShareServiceImpl@4c44.generateStoryImageAndBackground$2$bgPathDeferred$1");
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
            C474201sy c474201sy = C474201sy.LIZ;
            Context context = this.LLILLJJLI;
            String str = this.LLILLL;
            int i2 = this.LLILZ;
            this.LL = 1;
            c474201sy.getClass();
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            Forest forestLIZ = C0T1N.LIZ();
            String str2 = (String) C13LP.LJJJLZIJ(i2, (List) C474201sy.LIZLLL.getValue());
            if (str2 == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Index Error: ");
                sbLIZ.append(i2);
                C098200Yq c098200Yq = new C098200Yq(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)));
                C189200o6.m2constructorimpl(c098200Yq);
                c2252611DEt.resumeWith(c098200Yq);
            } else {
                RequestParams requestParams = new RequestParams(null, 1, null);
                requestParams.channel = "tiktok_social_user_relation_res";
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("imagine_studio/");
                sbLIZ2.append(str2);
                requestParams.bundle = C2188811AlT.LIZIZ(sbLIZ2);
                requestParams.waitGeckoUpdate = true;
                forestLIZ.fetchResourceAsync("", requestParams, new C469101s9(i2, context, str, c2252611DEt));
            }
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MixStudioShareServiceImpl@4c44.generateStoryImageAndBackground$2$bgPathDeferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MixStudioShareServiceImpl@4c44.generateStoryImageAndBackground$2$bgPathDeferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
