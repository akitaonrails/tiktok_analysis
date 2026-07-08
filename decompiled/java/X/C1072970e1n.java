package X;

import android.content.Context;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0e1n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1072970e1n extends C09AY implements Function0<C1908720zlm> {
    public C1072970e1n() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0zlm] */
    @Override // kotlin.jvm.functions.Function0
    public final C1908720zlm invoke() {
        return new InterfaceC1908760zlq() { // from class: X.0zlm
            @Override // X.InterfaceC1908760zlq
            public final InterfaceC1908740zlo LIZ(Context context) {
                return new InterfaceC1908740zlo(context) { // from class: X.0ZLu
                    public final Context LL;
                    public Function1<? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> LLILLJJLI;
                    public Function2<? super C0SY7, ? super C0SY7, Unit> LLILLL;
                    public Function1<? super C0SY7, Unit> LLILZ;
                    public Function2<? super C0SY7, ? super Boolean, Unit> LLILZIL;
                    public Function0<? extends InterfaceC898240ZLq> LLILZLL;

                    @Override // X.InterfaceC1908740zlo
                    public final Context getCtx() {
                        return this.LL;
                    }

                    @Override // X.InterfaceC1908740zlo
                    public final Function1<C0SY7, Unit> getDataChangeListener() {
                        return this.LLILZ;
                    }

                    @Override // X.InterfaceC1908740zlo
                    public final Function1<InterfaceC1364105Vn<? super Boolean>, Object> getFollowClickInterceptor() {
                        return this.LLILLJJLI;
                    }

                    @Override // X.InterfaceC1908740zlo
                    public final Function2<C0SY7, C0SY7, Unit> getFollowClickListener() {
                        return this.LLILLL;
                    }

                    @Override // X.InterfaceC1908740zlo
                    public final Function2<C0SY7, Boolean, Unit> getRequestListener() {
                        return this.LLILZIL;
                    }

                    @Override // X.InterfaceC1908740zlo
                    public final Function0<InterfaceC898240ZLq> getTracker() {
                        return this.LLILZLL;
                    }

                    {
                        this.LL = context;
                    }

                    @Override // X.InterfaceC1908740zlo
                    public final void setDataChangeListener(Function1<? super C0SY7, Unit> function1) {
                        this.LLILZ = function1;
                    }

                    @Override // X.InterfaceC1908740zlo
                    public final void setFollowClickInterceptor(Function1<? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function1) {
                        this.LLILLJJLI = function1;
                    }

                    @Override // X.InterfaceC1908740zlo
                    public final void setFollowClickListener(Function2<? super C0SY7, ? super C0SY7, Unit> function2) {
                        this.LLILLL = function2;
                    }

                    @Override // X.InterfaceC1908740zlo
                    public final void setRequestListener(Function2<? super C0SY7, ? super Boolean, Unit> function2) {
                        this.LLILZIL = function2;
                    }

                    @Override // X.InterfaceC1908740zlo
                    public final void setTracker(Function0<? extends InterfaceC898240ZLq> function0) {
                        this.LLILZLL = function0;
                    }
                };
            }

            @Override // X.InterfaceC1908760zlq
            public final InterfaceC1908750zlp LIZIZ(InterfaceC1908750zlp interfaceC1908750zlp) {
                if (interfaceC1908750zlp instanceof RelationButton) {
                    return new C1908810zlv((RelationButton) interfaceC1908750zlp);
                }
                if (interfaceC1908750zlp instanceof C1908730zln) {
                    return new C1908710zll((C1908730zln) interfaceC1908750zlp);
                }
                "IRelationView is not cast as any".toString();
                throw new IllegalStateException("IRelationView is not cast as any");
            }
        };
    }
}
