package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friends.service.IFriendSaasService;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS166S0101000_28;

/* JADX INFO: renamed from: X.0QQb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C670070QQb extends RelationButton {
    @Override // X.C197039127h, android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C670070QQb(Context context, AttributeSet attributeSet) {
        InterfaceC1908760zlq interfaceC1908760zlqLIZ;
        IFriendSaasService iFriendSaasService = (IFriendSaasService) PluggableExtentionKt.pluggableSpi$default(IFriendSaasService.class, false, false, false, 14, null);
        super(context, attributeSet, R.attr.xj, (iFriendSaasService == null || (interfaceC1908760zlqLIZ = iFriendSaasService.LIZ()) == null) ? new InterfaceC1908760zlq() { // from class: X.0zls
            @Override // X.InterfaceC1908760zlq
            public final InterfaceC1908740zlo LIZ(Context context2) {
                return new InterfaceC1908740zlo(context2) { // from class: X.0ZLv
                    public final Context LL;
                    public Function1<? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> LLILLJJLI;
                    public Function2<? super C0SY7, ? super C0SY7, Unit> LLILLL;
                    public Function2<? super C0SY7, ? super Boolean, Unit> LLILZ;
                    public Function1<? super C0SY7, Unit> LLILZIL;
                    public Function0<? extends InterfaceC898240ZLq> LLILZLL;

                    @Override // X.InterfaceC1908740zlo
                    public final Context getCtx() {
                        return this.LL;
                    }

                    @Override // X.InterfaceC1908740zlo
                    public final Function1<C0SY7, Unit> getDataChangeListener() {
                        return this.LLILZIL;
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
                        return this.LLILZ;
                    }

                    @Override // X.InterfaceC1908740zlo
                    public final Function0<InterfaceC898240ZLq> getTracker() {
                        return this.LLILZLL;
                    }

                    {
                        this.LL = context2;
                    }

                    @Override // X.InterfaceC1908740zlo
                    public final void setDataChangeListener(Function1<? super C0SY7, Unit> function1) {
                        this.LLILZIL = function1;
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
                        this.LLILZ = function2;
                    }

                    @Override // X.InterfaceC1908740zlo
                    public final void setTracker(Function0<? extends InterfaceC898240ZLq> function0) {
                        this.LLILZLL = function0;
                    }
                };
            }

            @Override // X.InterfaceC1908760zlq
            public final InterfaceC1908750zlp LIZIZ(InterfaceC1908750zlp interfaceC1908750zlp) {
                return new InterfaceC1908750zlp() { // from class: X.0zlt
                    @Override // X.InterfaceC1908750zlp
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC1908750zlp
                    public final void LJJIJIIJIL() {
                    }

                    @Override // X.InterfaceC1908750zlp
                    public final void LLLLZIL(C1908870zm1 c1908870zm1) {
                    }

                    @Override // X.InterfaceC1908750zlp
                    public final void LLILII(int i, AwS166S0101000_28 awS166S0101000_28) {
                        awS166S0101000_28.invoke();
                    }
                };
            }
        } : interfaceC1908760zlqLIZ);
    }

    public final void LJJLIIIJILLIZJL(EnumC662460Pye enumC662460Pye, C1908830zlx c1908830zlx) {
        setEnabled(true);
        int i = C662470Pyf.LIZ[enumC662460Pye.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    LLLLZIL(c1908830zlx);
                    return;
                }
                throw new C1954807lC();
            }
            LLLLZIL(c1908830zlx);
            setEnabled(false);
            setText(2131850892);
            return;
        }
        LLLLZIL(c1908830zlx);
        setText(2131821718);
    }
}
