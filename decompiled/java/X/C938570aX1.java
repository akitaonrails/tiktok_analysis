package X;

import Y.AfS184S0100000_15;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicVoiceChatLayoutSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aX1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C938570aX1 extends AbstractC939840aZ4 {
    public final DataChannel LLIZLLLIL;
    public final WeakReference<C938220aWS> LLJ;
    public AbstractC938650aX9 LLJI;
    public C938660aXA LLJIJIL;

    /* JADX INFO: renamed from: getLayoutId, reason: collision with other method in class */
    public Void m44getLayoutId() {
        return null;
    }

    @Override // X.AbstractC939840aZ4
    public /* bridge */ /* synthetic */ Integer getLayoutId() {
        return (Integer) m44getLayoutId();
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        String str;
        C938220aWS c938220aWS;
        C938230aWT c938230aWTLIZJ;
        C11PQ<List<C2262071DgL>> c11pq;
        super.onAttachedToWindow();
        C20441214yg.LIZIZ("VoiceGuestBizViewElement", "onAttachedToWindow");
        AbstractC938650aX9 c938670aXB = this.LLJI;
        if (c938670aXB != null) {
            c938670aXB.LJIIL();
        } else {
            String linkMicId = getWindow().getLinkMicId();
            if (linkMicId != null) {
                C01GW c01gw = C938590aX3.LIZ;
                DataChannel dataChannel = getDataChannel();
                c938670aXB = C500260Jjc.LJIIZILJ(dataChannel) ? new C938670aXB(dataChannel, linkMicId) : new C938620aX6(dataChannel, linkMicId);
                this.LLJI = c938670aXB;
                c938670aXB.LJIIL();
            }
        }
        C938660aXA c938660aXA = this.LLJIJIL;
        if (c938660aXA == null) {
            String linkMicId2 = getWindow().getLinkMicId();
            if (linkMicId2 != null) {
                C01GW c01gw2 = C938590aX3.LIZ;
                Context context = getContext();
                if (C931780aM4.LIZ() && LinkmicVoiceChatLayoutSetting.INSTANCE.getValue().useMaskCache) {
                    C01GW c01gw3 = C938590aX3.LIZIZ;
                    c938660aXA = (C938660aXA) ((C098J) c01gw3.getValue()).get(linkMicId2);
                    if (c938660aXA != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("cache hit, id=");
                        sbLIZ.append(linkMicId2);
                        C20441214yg.LIZIZ("VoiceChatLayoutCache", C2188811AlT.LIZIZ(sbLIZ));
                    } else {
                        c938660aXA = new C938660aXA(context, this);
                        ((C098J) c01gw3.getValue()).put(linkMicId2, c938660aXA);
                    }
                } else {
                    c938660aXA = new C938660aXA(context, this);
                }
            } else {
                c938660aXA = new C938660aXA(getContext(), this);
            }
            this.LLJIJIL = c938660aXA;
        }
        c938660aXA.LIZIZ(this.LLJI, this);
        AbstractC938650aX9 abstractC938650aX9 = this.LLJI;
        if (abstractC938650aX9 != null) {
            C933980aPc.LJIIJJI(abstractC938650aX9, getWindow(), this.LLJ, getCompositeDisposable());
        }
        PosIdentity posIdentity = getWindow().getPosIdentity();
        if (posIdentity == null || posIdentity.type != 1 || (str = posIdentity.value) == null || (c938220aWS = this.LLJ.get()) == null || (c938230aWTLIZJ = c938220aWS.LIZJ(str, false, false)) == null || (c11pq = c938230aWTLIZJ.LJ) == null) {
            return;
        }
        getCompositeDisposable().LIZ(new C11IW(c11pq.LJJII(new InterfaceC1627390sS1() { // from class: X.0aX2
            @Override // X.InterfaceC1627390sS1
            public final boolean test(Object obj, Object obj2) {
                Long lValueOf;
                List list = (List) obj2;
                C2262071DgL c2262071DgL = (C2262071DgL) C13LP.LJJJLL((List) obj);
                Long lValueOf2 = null;
                if (c2262071DgL != null) {
                    lValueOf = Long.valueOf(c2262071DgL.getId());
                } else {
                    lValueOf = null;
                }
                C2262071DgL c2262071DgL2 = (C2262071DgL) C13LP.LJJJLL(list);
                if (c2262071DgL2 != null) {
                    lValueOf2 = Long.valueOf(c2262071DgL2.getId());
                }
                return Intrinsics.LJFF(lValueOf, lValueOf2);
            }
        }).LJJIJIIJIL(new AfS184S0100000_15(this, 228))).LJIILL().LJIIZILJ());
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20441214yg.LIZIZ("VoiceGuestBizViewElement", "onDetachedFromWindow");
        AbstractC938650aX9 abstractC938650aX9 = this.LLJI;
        if (abstractC938650aX9 != null) {
            abstractC938650aX9.LJIILIIL();
        }
        C938660aXA c938660aXA = this.LLJIJIL;
        if (c938660aXA != null) {
            c938660aXA.LJIIJ();
        }
    }

    @Override // X.AbstractC939840aZ4
    public DataChannel getDataChannel() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC939840aZ4
    public EnumC939900aZA getElementType() {
        return EnumC939900aZA.VOICE_GUEST;
    }

    public C938570aX1(Context context, C957020b0m c957020b0m, DataChannel dataChannel, WeakReference weakReference) {
        super(context, dataChannel, c957020b0m, null);
        this.LLIZLLLIL = dataChannel;
        this.LLJ = weakReference;
    }
}
