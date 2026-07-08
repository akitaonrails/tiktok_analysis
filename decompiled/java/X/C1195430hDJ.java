package X;

import Y.ARunnableS118S0100000_18;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hDJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class C1195430hDJ extends C2217421BqW implements InterfaceC1631620sYq<String, Object, EnumC614120O6w, Unit> {
    public C1195430hDJ(Object obj) {
        super(3, obj, C1196950hFl.class, "motaCacheSubscriber", "motaCacheSubscriber(Ljava/lang/String;Ljava/lang/Object;Lcom/bytedance/mota/storage/motacache/StorageOperation;)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(String str, Object obj, EnumC614120O6w enumC614120O6w) {
        Boolean bool;
        Aweme awemeLJJLIIIJJIZ;
        C1196950hFl c1196950hFl = (C1196950hFl) this.receiver;
        c1196950hFl.getClass();
        if (obj != null) {
            String aid = null;
            if ((obj instanceof Boolean) && (bool = (Boolean) obj) != null && bool.booleanValue() && enumC614120O6w == EnumC614120O6w.Mutation) {
                InterfaceC1392640mLO interfaceC1392640mLO = c1196950hFl.LLILZIL;
                if (interfaceC1392640mLO != null && (awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ()) != null) {
                    aid = awemeLJJLIIIJJIZ.getAid();
                }
                if (Intrinsics.LJFF(aid, str)) {
                    C2487409ou.LIZJ(new ARunnableS118S0100000_18(c1196950hFl, 59));
                }
            }
        }
        return Unit.LIZ;
    }
}
