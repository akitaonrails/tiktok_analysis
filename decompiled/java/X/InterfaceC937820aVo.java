package X;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PlayerData;
import java.util.List;

/* JADX INFO: renamed from: X.0aVo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public interface InterfaceC937820aVo {
    InterfaceC937840aVq LJI(String str);

    void LJIILIIL(View view, boolean z, boolean z2);

    void LJL(PlayerData playerData);

    boolean LJZI();

    List<InterfaceC937840aVq> getAllLayoutWindows();

    Rect getContainerActualRange();

    @InterfaceC1294060jmO
    Rect getContainerAllRange();

    String getLayoutBusinessType();

    String getLayoutId();

    @InterfaceC1294060jmO
    String getLayoutName();

    @InterfaceC1294060jmO
    Rect getPlayerRange();

    String getRealDrawLayoutId();

    void setNotAddViewOpt(int i);
}
