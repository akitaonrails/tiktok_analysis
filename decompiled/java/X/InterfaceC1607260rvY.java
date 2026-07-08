package X;

import android.view.View;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0rvY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public interface InterfaceC1607260rvY {
    void LIZ(int i, View.OnClickListener onClickListener);

    View.OnClickListener LIZIZ(int i);

    boolean LIZJ();

    void LIZLLL(int i);

    Function2<EnumC1608710rxt, InterfaceC1606880ruw, Unit> getOnNodeClickListener();

    void setAvatarComponentView(AvatarComponentView avatarComponentView);

    void setOnNodeClickListener(Function2<? super EnumC1608710rxt, ? super InterfaceC1606880ruw, Unit> function2);
}
