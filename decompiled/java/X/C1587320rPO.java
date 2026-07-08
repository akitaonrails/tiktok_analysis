package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.friends.FriendsFeed;

/* JADX INFO: renamed from: X.0rPO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1587320rPO {
    public final Fragment LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final C1587710rQ1 LIZLLL;

    public final boolean LIZIZ() {
        T t = this.LIZLLL.LL;
        if (t == 0 || !((AbstractC1255880imo) t).isHasMore()) {
            return false;
        }
        C1587380rPU c1587380rPU = new C1587380rPU(4, C0NMC.LOADMORE.getType(), C0TJ8.LIZJ("feed").LJ());
        C0TJ8.LIZJ("feed").LIZLLL();
        return this.LIZLLL.LIZJ(4, c1587380rPU.LIZ());
    }

    public C1587320rPO(Fragment fragment) {
        this.LIZ = fragment;
        this.LIZLLL = new C1587710rQ1(fragment);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZ(Object obj, int i) {
        if (obj instanceof Aweme) {
            C1587710rQ1 c1587710rQ1 = this.LIZLLL;
            FriendsFeed friendsFeed = new FriendsFeed(null, 0, "", 1, null);
            friendsFeed.setSource(EnumC1586890rOh.HISTORY_VIEWED.getDataLevel());
            friendsFeed.setAweme((Aweme) obj);
            c1587710rQ1.LJIJ(friendsFeed, i);
        }
    }
}
