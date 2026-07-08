package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.livepin.GameLivePartnershipPinCardModel;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.impl.AbsBaseMixPageHost$addLifeCycleObserver$1$1;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z39, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1881050z39 implements InterfaceC1878370yyp {
    public final Context LIZ;
    public final Room LIZIZ;
    public final DataChannel LIZJ;
    public final int LIZLLL;
    public final Map<String, String> LJ;
    public final String LJFF;
    public final Function1<Boolean, Unit> LJI;
    public final Function1<JSONObject, Unit> LJII;
    public ViewGroup LJIIIIZZ;
    public C1881040z38 LJIIIZ;
    public final C1881130z3H LJIIJ = new InterfaceC1883280z6k() { // from class: X.0z3H
        @Override // X.InterfaceC1883280z6k
        public final void LIZJ() {
        }

        @Override // X.InterfaceC1883280z6k
        public final void LJFF() {
        }

        @Override // X.InterfaceC1883280z6k
        public final void LIZLLL(boolean z) {
            this.LL.LJI.invoke(Boolean.valueOf(z));
        }
    };

    @Override // X.InterfaceC1878370yyp
    public final void LIZ() {
        C20441214yg.LIZIZ("GameLivePartnershipPinCardWidget", "onPinCardDestroyed");
        C1881040z38 c1881040z38 = this.LJIIIZ;
        if (c1881040z38 != null) {
            c1881040z38.LJIIIZ().LIZIZ(this.LJIIJ);
        }
        C1881040z38 c1881040z382 = this.LJIIIZ;
        if (c1881040z382 != null) {
            c1881040z382.LJI();
        }
        this.LJIIIZ = null;
        ViewGroup viewGroup = this.LJIIIIZZ;
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        this.LJIIIIZZ = null;
    }

    public final void LIZJ(FrameLayout frameLayout, LifecycleOwner lifecycleOwner) {
        C20441214yg.LIZIZ("GameLivePartnershipPinCardWidget", "onPinCardViewCreated");
        this.LJIIIIZZ = frameLayout;
        C1881040z38 c1881040z38 = new C1881040z38(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJII);
        c1881040z38.LLILZIL = lifecycleOwner;
        if (!c1881040z38.LLILLL) {
            c1881040z38.LLILLL = true;
            lifecycleOwner.getLifecycle().addObserver(new AbsBaseMixPageHost$addLifeCycleObserver$1$1(c1881040z38, lifecycleOwner));
        }
        c1881040z38.LJIIIZ().LJIJI(this.LJIIJ);
        c1881040z38.h(frameLayout);
        this.LJIIIZ = c1881040z38;
    }

    @Override // X.InterfaceC1878370yyp
    public final void LIZIZ(FrameLayout frameLayout, int i, Map<String, String> map, String str) {
        ViewGroup viewGroup = this.LJIIIIZZ;
        if (viewGroup != null && !Intrinsics.LJFF(viewGroup, frameLayout)) {
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                C786410Ut5.LJJLIL(childCount, viewGroup);
                frameLayout.addView(childAt, 0);
            }
        }
        this.LJIIIIZZ = frameLayout;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadPinCard pinCardType=");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("GameLivePartnershipPinCardWidget", C2188811AlT.LIZIZ(sbLIZ));
        C1881040z38 c1881040z38 = this.LJIIIZ;
        if (c1881040z38 != null) {
            c1881040z38.LJJ(map);
            c1881040z38.LJJI(map);
            c1881040z38.LJJIFFI();
            GameLivePartnershipPinCardModel gameLivePartnershipPinCardModel = new GameLivePartnershipPinCardModel();
            gameLivePartnershipPinCardModel.pinCardType = Integer.valueOf(i);
            gameLivePartnershipPinCardModel.schemaExtras = map;
            gameLivePartnershipPinCardModel.initialData = str;
            gameLivePartnershipPinCardModel.gameInfo = c1881040z38.LLJJIJI;
            c1881040z38.LJIL(new JSONObject(C476770Imp.LJ(gameLivePartnershipPinCardModel)));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0z3H] */
    public C1881050z39(Context context, Room room, DataChannel dataChannel, int i, Map map, String str, AwS603S0100000_24 awS603S0100000_24, AwS607S0100000_28 awS607S0100000_28) {
        this.LIZ = context;
        this.LIZIZ = room;
        this.LIZJ = dataChannel;
        this.LIZLLL = i;
        this.LJ = map;
        this.LJFF = str;
        this.LJI = awS603S0100000_24;
        this.LJII = awS607S0100000_28;
    }
}
