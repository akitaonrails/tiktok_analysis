package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.ui.share.SharedVideoDeepLinkHelper;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0O0m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ui.share.SharedVideoDeepLinkHelper$1$1", f = "SharedVideoDeepLinkHelper.kt", l = {}, m = "invokeSuspend")
public final class C612460O0m extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SharedVideoDeepLinkHelper LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ FollowStatus LLILLL;
    public final /* synthetic */ Integer LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C612460O0m(SharedVideoDeepLinkHelper sharedVideoDeepLinkHelper, String str, FollowStatus followStatus, Integer num, boolean z, InterfaceC1364105Vn<? super C612460O0m> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = sharedVideoDeepLinkHelper;
        this.LLILLJJLI = str;
        this.LLILLL = followStatus;
        this.LLILZ = num;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C612460O0m(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<Aweme> listFg;
        User sharer;
        User sharer2;
        C1C7U.LIZ("SharedVideoDeepLinkHelper@a50d.<init>$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C612470O0n c612470O0n = (C612470O0n) this.LL.LLJI.getValue();
        String str = this.LLILLJJLI;
        int followStatus = this.LLILLL.getFollowStatus();
        int iIntValue = this.LLILZ.intValue();
        C0SR4 c0sr4 = c612470O0n.LIZ.LLJL;
        if (c0sr4 == null || (listFg = c0sr4.Fg()) == null) {
            listFg = C13BV.INSTANCE;
        }
        List listLJLIL = C13LP.LJLIL(C612470O0n.LIZIZ, listFg);
        HashSet hashSet = new HashSet();
        ArrayList<Aweme> arrayList = new ArrayList();
        for (Object obj2 : (ArrayList) listLJLIL) {
            if (hashSet.add(((Aweme) obj2).getAid())) {
                arrayList.add(obj2);
            }
        }
        ArrayList<Aweme> arrayList2 = new ArrayList();
        for (Aweme aweme : arrayList) {
            if (aweme != null && (sharer2 = AwemeBizExtKt.getSharer(aweme)) != null && Intrinsics.LJFF(sharer2.getUid(), str)) {
                arrayList2.add(aweme);
            }
        }
        for (Aweme aweme2 : arrayList2) {
            User sharer3 = AwemeBizExtKt.getSharer(aweme2);
            if (sharer3 != null) {
                sharer3.setFollowStatus(followStatus);
            }
            if (iIntValue != -1 && (sharer = AwemeBizExtKt.getSharer(aweme2)) != null) {
                sharer.setFollowerStatus(iIntValue);
            }
        }
        C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
        c2276471E8n.LIZIZ("recommend_feed", "@LinkRelation_Video", "need update aweme size: " + arrayList2.size());
        if (!arrayList2.isEmpty()) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C2108208Ns.LIZ), null, null, new C612450O0l(arrayList2, c612470O0n, followStatus, null), 3);
        } else {
            c2276471E8n.LIZIZ("recommend_feed", "@LinkRelation_Video", "not need to update followStatus");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SharedVideoDeepLinkHelper@a50d.<init>$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
