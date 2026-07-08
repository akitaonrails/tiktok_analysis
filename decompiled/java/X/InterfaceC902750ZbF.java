package X;

import X.InterfaceC461380I7k;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.cell.IMSkeletonLayoutPowerCell;
import java.lang.Enum;
import java.util.List;

/* JADX INFO: renamed from: X.0ZbF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public interface InterfaceC902750ZbF<SEND extends InterfaceC461380I7k, RECEIVE extends InterfaceC461380I7k, E extends Enum<E>> extends InterfaceC904610ZeF<E>, InterfaceC902780ZbI<SEND, RECEIVE> {
    C902700ZbA Cc();

    C902690Zb9 Sb();

    Class<? extends IMSkeletonLayoutPowerCell<?, SEND>> da();

    E getInterceptOrdering();

    InterfaceC903660Zci getMsgHandlerCheck();

    Class<? extends IMSkeletonLayoutPowerCell<?, RECEIVE>> gr();

    List<C869590Y9l> intercept(List<? extends C869590Y9l> list);
}
