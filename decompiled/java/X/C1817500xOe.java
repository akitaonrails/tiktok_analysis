package X;

import android.graphics.Bitmap;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.DecorationEditAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.DecorationEditNavigationViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.BoardSceneryFragment;
import com.bytedance.android.livesdk.model.BoardItem;
import com.bytedance.android.livesdk.model.ImageContent;
import com.bytedance.android.livesdk.model.SceneryContent;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xOe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1817500xOe extends C09AY implements Function2<UIAssem, C291001Au<? extends InterfaceC1817490xOd>, Unit> {
    public final /* synthetic */ DecorationEditAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1817500xOe(DecorationEditAssem decorationEditAssem) {
        super(2);
        this.LL = decorationEditAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends InterfaceC1817490xOd> c291001Au) {
        FragmentManager fragmentManager;
        String str;
        HashMap<String, String> map;
        ImageContent imageContent;
        ImageContent imageContent2;
        String str2;
        InterfaceC1817490xOd interfaceC1817490xOdLIZ = c291001Au.LIZ();
        if (interfaceC1817490xOdLIZ != null && !(interfaceC1817490xOdLIZ instanceof C1817660xOu)) {
            if (interfaceC1817490xOdLIZ instanceof C1817470xOb) {
                DecorationEditNavigationViewModel decorationEditNavigationViewModelIp = this.LL.ip();
                C1817470xOb c1817470xOb = (C1817470xOb) interfaceC1817490xOdLIZ;
                if (c1817470xOb.LIZ.boardItemType == 5) {
                    str2 = "text_btn";
                } else {
                    str2 = "secondary_board_btn";
                }
                decorationEditNavigationViewModelIp.yQ2(str2);
                this.LL.kp(c1817470xOb.LIZ, c1817470xOb.LIZIZ);
            } else if (interfaceC1817490xOdLIZ instanceof C1817480xOc) {
                this.LL.ip().yQ2("scenery_btn");
                DataChannel dataChannel = this.LL.hp().LLILLJJLI;
                if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                    DecorationEditAssem decorationEditAssem = this.LL;
                    C1817690xOx c1817690xOx = BoardSceneryFragment.LLJILJILJ;
                    C1817480xOc c1817480xOc = (C1817480xOc) interfaceC1817490xOdLIZ;
                    BoardItem boardItem = (BoardItem) C105700ad.LIZ(C105700ad.LIZIZ(c1817480xOc.LIZ), BoardItem.class);
                    if (boardItem == null) {
                        boardItem = new BoardItem();
                    }
                    if (boardItem.sceneryContent == null) {
                        boardItem.sceneryContent = new SceneryContent();
                    }
                    SceneryContent sceneryContent = boardItem.sceneryContent;
                    Bitmap bitmap = null;
                    if (sceneryContent != null && sceneryContent.imageContent == null && sceneryContent != null) {
                        sceneryContent.imageContent = new ImageContent();
                    }
                    SceneryContent sceneryContent2 = boardItem.sceneryContent;
                    if (sceneryContent2 != null && (imageContent = sceneryContent2.imageContent) != null) {
                        SceneryContent sceneryContent3 = c1817480xOc.LIZ.sceneryContent;
                        if (sceneryContent3 != null && (imageContent2 = sceneryContent3.imageContent) != null) {
                            bitmap = imageContent2.LIZ;
                        }
                        imageContent.LIZ = bitmap;
                    }
                    C1817550xOj c1817550xOj = ((C1120090fFn) decorationEditAssem.LLJJJJ.getValue()).LL;
                    if (c1817550xOj == null || (map = c1817550xOj.LIZ) == null || (str = map.get("decoration_entrance")) == null) {
                        str = "live_take_page";
                    }
                    c1817690xOx.getClass();
                    BoardSceneryFragment boardSceneryFragment = new BoardSceneryFragment();
                    boardSceneryFragment.LL = boardItem;
                    boardSceneryFragment.LLILLJJLI = 6;
                    boardSceneryFragment.LLILLL = str;
                    boardSceneryFragment.show(fragmentManager, "BoardSceneryFragment");
                }
            } else {
                throw new C1954807lC();
            }
        }
        return Unit.LIZ;
    }
}
