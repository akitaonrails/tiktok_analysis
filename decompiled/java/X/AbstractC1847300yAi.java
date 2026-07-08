package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import avg.f;
import com.bytedance.android.livesdk.comp.api.decoration.api.RoomStickerApi;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: renamed from: X.0yAi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1847300yAi extends ConstraintLayout {
    public final RoomSticker LL;
    public final DataChannel LLILLJJLI;
    public final long LLILLL;
    public final boolean LLILZ;
    public boolean LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final List<EnumC1847310yAj> LLIZLLLIL;
    public final List<EnumC1847310yAj> LLJ;

    public abstract Pair<Integer, Integer> B0();

    public C1847220yAa i0() {
        return null;
    }

    public final void j0() {
        View.OnClickListener fVar = new View.OnClickListener() { // from class: X.0yAl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        };
        if (C1848410yCV.LIZ) {
            fVar = new f(fVar);
        }
        a aVar = new a(fVar);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
        l0();
    }

    public final void z0() {
        if (this.LLILZ) {
            ((RoomStickerApi) C482260Ivg.LIZJ(RoomStickerApi.class)).setRoomStickers(C2097608Jq.LJIIIIZZ(new Pair("extra", this.LL.extra), new Pair("room_id", Long.valueOf(this.LLILLL)), new Pair(FollowStatusChangeMethod.PARAM_UID, Long.valueOf(this.LL.id)), new Pair("type", Integer.valueOf(this.LL.type)), new Pair("x", Integer.valueOf(this.LL.xPosition)), new Pair("y", Integer.valueOf(this.LL.yPosition)), new Pair("w", Integer.valueOf(this.LLILZLL)), new Pair("h", Integer.valueOf(this.LLIZ)))).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.00an
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("StickerView@fe9c.updatePosition2Server$1");
                    C1C7U.LIZIZ("StickerView@fe9c.updatePosition2Server$1");
                }
            }, new C09JN() { // from class: X.00am
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("StickerView@fe9c.updatePosition2Server$2");
                    Throwable th = (Throwable) obj;
                    try {
                        if (th instanceof Exception) {
                            if (th instanceof C501470JlZ) {
                                C766270U4b.LJIIJJI(((C501470JlZ) th).getPrompt());
                            } else {
                                C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131851990));
                            }
                        } else {
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C189200o6.m2constructorimpl(new C098200Yq(th2));
                    }
                    C1C7U.LIZIZ("StickerView@fe9c.updatePosition2Server$2");
                }
            });
        }
    }

    public void hide() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hide: ");
        sbLIZ.append(this.LL.type);
        sbLIZ.append(" - ");
        sbLIZ.append(this.LL.id);
        C20441214yg.LIZIZ("StickerView", C2188811AlT.LIZIZ(sbLIZ));
    }

    public void l0() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("insert: ");
        sbLIZ.append(this.LL.type);
        sbLIZ.append(" - ");
        sbLIZ.append(this.LL.id);
        C20441214yg.LIZIZ("StickerView", C2188811AlT.LIZIZ(sbLIZ));
    }

    public void p0() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("remove: ");
        sbLIZ.append(this.LL.type);
        sbLIZ.append(" - ");
        sbLIZ.append(this.LL.id);
        C20441214yg.LIZIZ("StickerView", C2188811AlT.LIZIZ(sbLIZ));
    }

    public void s0() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("remove: ");
        sbLIZ.append(this.LL.type);
        sbLIZ.append(" - ");
        sbLIZ.append(this.LL.id);
        C20441214yg.LIZIZ("StickerView", C2188811AlT.LIZIZ(sbLIZ));
    }

    public void u0() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("restore: ");
        sbLIZ.append(this.LL.type);
        sbLIZ.append(" - ");
        sbLIZ.append(this.LL.id);
        C20441214yg.LIZIZ("StickerView", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final DataChannel getDataChannel() {
        return this.LLILLJJLI;
    }

    public List<EnumC1847310yAj> getStateListenerTypes() {
        return this.LLIZLLLIL;
    }

    public final RoomSticker getSticker() {
        return this.LL;
    }

    public final void e0(int[] iArr) {
        Pair<Integer, Integer> pairH0 = h0((int) getX(), (int) getY(), iArr);
        float fIntValue = pairH0.getFirst().intValue();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setX(fIntValue);
        float fIntValue2 = pairH0.getSecond().intValue();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setY(fIntValue2);
    }

    public final boolean n0(EnumC1847310yAj enumC1847310yAj) {
        return getStateListenerTypes().contains(enumC1847310yAj);
    }

    public final Pair<Integer, Integer> h0(int i, int i2, int[] iArr) {
        int i3 = iArr[2];
        if (i < i3) {
            i = i3;
        } else {
            float measuredWidth = i + getMeasuredWidth();
            int i4 = iArr[3];
            if (measuredWidth > i4) {
                i = (int) (i4 - getMeasuredWidth());
            }
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.ayt);
        if (i2 < dimensionPixelSize) {
            i2 = dimensionPixelSize;
        } else {
            float measuredHeight = i2 + getMeasuredHeight();
            int i5 = iArr[1];
            if (measuredHeight > i5) {
                i2 = (int) (i5 - getMeasuredHeight());
            }
        }
        return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public AbstractC1847300yAi(Context context, RoomSticker roomSticker, DataChannel dataChannel, int i) {
        super(context);
        this.LL = roomSticker;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = C500260Jjc.LJJLIIIJ(dataChannel);
        this.LLILZ = Intrinsics.LJFF(dataChannel.gg0(UserIsAnchorChannel.class), Boolean.TRUE);
        this.LLILZIL = true;
        this.LLILZLL = C12ES.LJIIJ(getContext());
        this.LLIZ = C12ES.LJIIIIZZ(getContext());
        this.LLIZLLLIL = C1697810uHb.LJIIJJI(EnumC1847310yAj.PAUSE_LIVE, EnumC1847310yAj.PAUSE_EVENT, EnumC1847310yAj.PAID_EVENT, EnumC1847310yAj.HOST_LINK, EnumC1847310yAj.SUB_ONLY_AUDIENCE);
        this.LLJ = new ArrayList();
        ViewGroup.inflate(context, i, this);
    }
}
