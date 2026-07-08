package X;

import android.app.Activity;
import com.bytedance.mota.storage.motacache.IMotaCache;
import com.ss.android.ugc.aweme.state.ability.IState;
import com.ss.android.ugc.aweme.state.ability.IStateNotifier;
import com.ss.android.ugc.aweme.state.base.StateAgentCache;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0O5X, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public abstract class C0O5X<S> implements IState<S>, IStateNotifier<S> {
    public final C13IQ<? extends StateAgentCache<S>> LIZ;
    public final C612250Nzr<S> LIZIZ = new C612250Nzr<>();

    public abstract IMotaCache LIZIZ(Object obj, String str);

    @Override // com.ss.android.ugc.aweme.state.ability.IStateNotifier
    public final InterfaceC346201Wa<C612190Nzl<S>> subscribe() {
        return C09IC.LIZ(this.LIZIZ.LIZJ);
    }

    public C0O5X(C19719912Dl c19719912Dl) {
        this.LIZ = c19719912Dl;
        C2214201BlK.LIZ().LJJIL(new InterfaceC19483011Ki() { // from class: X.08Bn
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                return obj instanceof C08B7;
            }
        }).LIZIZ(new InterfaceC626120Oh8<Activity>(this) { // from class: X.0O5a
            public final /* synthetic */ C0O5X<Object> LL;

            @Override // X.InterfaceC626120Oh8
            public final void onComplete() {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onError(Throwable th) {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
            }

            {
                this.LL = this;
            }

            @Override // X.InterfaceC626120Oh8
            public final void onNext(Activity activity) {
                this.LL.LIZIZ.LIZ.LJIIIZ(-1);
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.state.ability.IStateNotifier
    public final void addSubscriber(InterfaceC612260Nzs<S> interfaceC612260Nzs) {
        this.LIZIZ.LIZIZ.add(interfaceC612260Nzs);
    }

    @Override // com.ss.android.ugc.aweme.state.ability.IStateNotifier
    public final void removeSubscriber(InterfaceC612260Nzs<S> interfaceC612260Nzs) {
        if (interfaceC612260Nzs != null) {
            this.LIZIZ.LIZIZ.remove(interfaceC612260Nzs);
        }
    }

    @Override // com.ss.android.ugc.aweme.state.ability.IState
    public final S currentState(String str, S s) {
        S second;
        if (str != null && str.length() != 0) {
            Pair<S, S> pairLIZJ = this.LIZIZ.LIZ.LIZJ(str);
            if (pairLIZJ != null && (second = pairLIZJ.getSecond()) != null) {
                C0O5Y c0o5y = C0O5Y.LIZ;
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(getClass());
                c0o5y.getClass();
                C0O5Y.LIZIZ(str, c19719912DlLIZ, true, second);
                return second;
            }
            C0O5Y c0o5y2 = C0O5Y.LIZ;
            C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(getClass());
            c0o5y2.getClass();
            C0O5Y.LIZIZ(str, c19719912DlLIZ2, false, s);
            if (str.length() > 0) {
                syncState(str, s, false);
                return s;
            }
            return s;
        }
        return s;
    }

    @Override // com.ss.android.ugc.aweme.state.ability.IState
    public final void syncState(final String str, final S s, boolean z) {
        if (str.length() == 0) {
            C0O5Y.LIZ.getClass();
            C0O5Y.LJ("id is empty", "id is empty");
        } else if (z) {
            C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0O5W
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("BaseStateAgent@b55d.syncState$1");
                    try {
                        this.LIZIZ.LIZIZ(s, str);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("BaseStateAgent@b55d.syncState$1");
                }
            });
        } else {
            this.LIZIZ.LIZIZ(s, str);
        }
    }
}
