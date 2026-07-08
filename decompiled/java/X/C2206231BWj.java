package X;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.reply.MessageReplyVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS281S0000000_34;
import kotlin.jvm.internal.AwS118S1000000_34;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: renamed from: X.1BWj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2206231BWj extends C09AY implements Function0<C2239621ClE> {
    public C2206231BWj() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C2239621ClE invoke() {
        return new InterfaceC894260Z6i() { // from class: X.1ClE
            @Override // X.InterfaceC894260Z6i
            public final void LIZ(String str, LifecycleOwner lifecycleOwner) {
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
                AwS118S1000000_34 awS118S1000000_34 = new AwS118S1000000_34(str, 2);
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageReplyVM.class);
                AFwS281S0000000_34 aFwS281S0000000_34 = AFwS281S0000000_34.get$arr$(75);
                AwS547S0100000_3 awS547S0100000_3 = new AwS547S0100000_3(awS118S1000000_34, (Function0<Unit>) 178);
                C452070Ho5 c452070Ho5 = new C452070Ho5();
                C1622206Wu c1622206WuLJII = C724750Sbp.LJII(lifecycleOwner);
                if (lifecycleOwner instanceof HasDefaultViewModelProviderFactory) {
                    hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) lifecycleOwner;
                } else {
                    hasDefaultViewModelProviderFactory = null;
                }
                ((MessageReplyVM) new C736950SvV(c19719912DlLIZ, awS547S0100000_3, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(hasDefaultViewModelProviderFactory), aFwS281S0000000_34, null, null, null).getValue()).At1();
            }

            @Override // X.InterfaceC894260Z6i
            public final C869590Y9l LIZIZ(String str, LifecycleOwner lifecycleOwner) {
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
                AwS118S1000000_34 awS118S1000000_34 = new AwS118S1000000_34(str, 1);
                C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageReplyVM.class);
                AFwS281S0000000_34 aFwS281S0000000_34 = AFwS281S0000000_34.get$arr$(74);
                AwS547S0100000_3 awS547S0100000_3 = new AwS547S0100000_3(awS118S1000000_34, (Function0<Unit>) 177);
                C452070Ho5 c452070Ho5 = new C452070Ho5();
                C1622206Wu c1622206WuLJII = C724750Sbp.LJII(lifecycleOwner);
                if (lifecycleOwner instanceof HasDefaultViewModelProviderFactory) {
                    hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) lifecycleOwner;
                } else {
                    hasDefaultViewModelProviderFactory = null;
                }
                C454980Hsm c454980Hsm = (C454980Hsm) ((MessageReplyVM) new C736950SvV(c19719912DlLIZ, awS547S0100000_3, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(hasDefaultViewModelProviderFactory), aFwS281S0000000_34, null, null, null).getValue()).LLILZ.getValue();
                if (c454980Hsm == null) {
                    return null;
                }
                return c454980Hsm.LIZ;
            }
        };
    }
}
