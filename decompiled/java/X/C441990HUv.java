package X;

import android.widget.FrameLayout;
import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility;
import com.ss.android.ugc.aweme.im.chatroom.input.components.stickerbtn.IEmojiBtnAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0HUv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C441990HUv extends C09AY implements Function1<C0SZ5, Unit> {
    public final /* synthetic */ UIAssem LL;
    public final /* synthetic */ IEmojiBtnAbility LLILLJJLI;
    public final /* synthetic */ InterfaceC441960HUs LLILLL;
    public final /* synthetic */ IInputFieldAbility LLILZ;
    public final /* synthetic */ FrameLayout LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C441990HUv(UIAssem uIAssem, IEmojiBtnAbility iEmojiBtnAbility, InterfaceC441960HUs interfaceC441960HUs, IInputFieldAbility iInputFieldAbility, FrameLayout frameLayout) {
        super(1);
        this.LL = uIAssem;
        this.LLILLJJLI = iEmojiBtnAbility;
        this.LLILLL = interfaceC441960HUs;
        this.LLILZ = iInputFieldAbility;
        this.LLILZIL = frameLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0SZ5 c0sz5) {
        C0SZ5 c0sz52 = c0sz5;
        C0HYN.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, C458790Hyv.LL, null).invoke(c0sz52);
        c0sz52.LLIZLLLIL = this.LLILZIL.getId();
        return Unit.LIZ;
    }
}
