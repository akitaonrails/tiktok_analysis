package X;

import android.content.Context;
import com.bytedance.ies.xelement.defaultimpl.player.impl.entity.XAudioList;
import com.bytedance.ies.xelement.defaultimpl.player.impl.entity.XAudioSrc;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.base.xelements.xaudio.ActivityMonitorImpl;
import j27.s;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AQV, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AQV implements InterfaceC2178171AMl {
    public static final String LJIJ = C1AQV.class.getSimpleName();
    public final Context LIZ;
    public C1AQX LIZIZ;
    public C2179281AQs LIZJ;
    public C2179481ARm LIZLLL;
    public C1ARG LJ;
    public List<String> LJFF;
    public final C1AOB LJII;
    public C1AN4 LJIIJJI;
    public InterfaceC2179131AQd LJIIL;
    public InterfaceC2179261AQq LJIILIIL;
    public C1AQY LJIILJJIL;
    public boolean LJIILL;
    public C1ANB LJI = C1ANB.DEFAULT;
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4139));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(628));
    public final C01GW LJIIJ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(627));
    public boolean LJIILLIIL = true;
    public boolean LJIIZILJ = true;

    @Override // X.InterfaceC2178171AMl
    public final void LIZ() {
        C2179281AQs c2179281AQs;
        C2179281AQs c2179281AQs2;
        C2179281AQs c2179281AQs3 = new C2179281AQs(this.LIZ, this.LJII);
        this.LIZJ = c2179281AQs3;
        c2179281AQs3.LJJIFFI((C1AQW) this.LJIIIIZZ.getValue());
        c2179281AQs3.LJJI((C1AQW) this.LJIIIIZZ.getValue());
        LJIILLIIL(this.LJI);
        LJIJJLI();
        C1AQY c1aqy = this.LJIILJJIL;
        if (c1aqy != null && (c2179281AQs2 = this.LIZJ) != null) {
            c2179281AQs2.LJJIJIIJI(c1aqy);
        }
        LJIJ();
        InterfaceC2179131AQd interfaceC2179131AQd = this.LJIIL;
        if (interfaceC2179131AQd != null && (c2179281AQs = this.LIZJ) != null) {
            c2179281AQs.LJJIJIL(interfaceC2179131AQd);
        }
        LJIL();
        String str = LJIJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" attached.");
        C2178901APg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC2178171AMl
    public final int LIZIZ() {
        C2179281AQs c2179281AQs = this.LIZJ;
        if (c2179281AQs != null) {
            return (int) c2179281AQs.LIZIZ();
        }
        return 0;
    }

    @Override // X.InterfaceC2178171AMl
    public final C1ANG LIZJ() {
        C2179281AQs c2179281AQs = this.LIZJ;
        return LIZLLL(c2179281AQs != null ? c2179281AQs.LIZJ() : null);
    }

    @Override // X.InterfaceC2178171AMl
    public final long LJFF() {
        C2179281AQs c2179281AQs = this.LIZJ;
        if (c2179281AQs != null) {
            return c2179281AQs.LJJIIZ();
        }
        return 0L;
    }

    @Override // X.InterfaceC2178171AMl
    public final void LJI() {
        C2179281AQs c2179281AQs = this.LIZJ;
        if (c2179281AQs != null) {
            c2179281AQs.LIZLLL(new C0NIR("STOP_FROM_PAGE_EXIT"));
            c2179281AQs.LJJIJIL(null);
            c2179281AQs.LJJIIZI();
            String str = LJIJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" detached.");
            C2178901APg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        }
        ((ArrayList) this.LJIIIZ.getValue()).clear();
        this.LJ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
    }

    @Override // X.InterfaceC2178171AMl
    public final String LJIIL() {
        InterfaceC2179261AQq interfaceC2179261AQqLIZ;
        String id;
        C2179281AQs c2179281AQs = this.LIZJ;
        return (c2179281AQs == null || (interfaceC2179261AQqLIZ = c2179281AQs.LIZ()) == null || (id = interfaceC2179261AQqLIZ.getId()) == null) ? "" : id;
    }

    @Override // X.InterfaceC2178171AMl
    public final long LJIILIIL() {
        C2179281AQs c2179281AQs = this.LIZJ;
        if (c2179281AQs != null) {
            return c2179281AQs.LJJIII();
        }
        return 0L;
    }

    public final void LJIJ() {
        boolean z = this.LJIIZILJ;
        C2179281AQs c2179281AQs = this.LIZJ;
        if (c2179281AQs == null) {
            return;
        }
        C1ARG c1arg = this.LJ;
        if (c1arg == null) {
            c1arg = new C1ARG(C786410Ut5.N3(this.LIZ));
            this.LJ = c1arg;
        }
        if (z) {
            c2179281AQs.LJJII(c1arg);
        } else {
            c2179281AQs.LJJIJ(c1arg);
        }
    }

    public final void LJIJI() {
        C2179281AQs c2179281AQs;
        C1AN4 c1an4 = this.LJIIJJI;
        if (c1an4 == null || (c2179281AQs = this.LIZJ) == null) {
            return;
        }
        C2179481ARm c2179481ARm = this.LIZLLL;
        if (c2179481ARm == null) {
            c2179481ARm = new C2179481ARm(this.LIZ, c1an4.LIZIZ, c1an4.LIZ, c1an4.LIZJ);
            this.LIZLLL = c2179481ARm;
        }
        if (this.LJIILLIIL) {
            c2179281AQs.LJJII(c2179481ARm);
        } else {
            c2179281AQs.LJJIJ(c2179481ARm);
        }
    }

    public final void LJIJJ() {
        C2179281AQs c2179281AQs;
        C1AN4 c1an4 = this.LJIIJJI;
        if (c1an4 == null || (c2179281AQs = this.LIZJ) == null) {
            return;
        }
        List<String> list = this.LJFF;
        Iterator it2 = ((ArrayList) this.LJIIIZ.getValue()).iterator();
        while (it2.hasNext()) {
            c2179281AQs.LJJIJ((C1ARN) it2.next());
        }
        ((ArrayList) this.LJIIIZ.getValue()).clear();
        if (list != null) {
            Iterator<String> it3 = list.iterator();
            while (it3.hasNext()) {
                InterfaceC2179141AQe interfaceC2179141AQe = c1an4.LIZLLL.get(it3.next());
                if (interfaceC2179141AQe != null) {
                    C1ARN c1arnCreate = interfaceC2179141AQe.create();
                    ((ArrayList) this.LJIIIZ.getValue()).add(c1arnCreate);
                    c2179281AQs.LJJII(c1arnCreate);
                }
            }
        }
    }

    public final void LJIJJLI() {
        C1AN4 c1an4;
        C2179281AQs c2179281AQs = this.LIZJ;
        if (c2179281AQs == null || (c1an4 = this.LJIIJJI) == null) {
            return;
        }
        ActivityMonitorImpl activityMonitorImpl = c1an4.LIZ;
        if (activityMonitorImpl != null) {
            c2179281AQs.LJJII(new C1ARF(activityMonitorImpl));
        }
        LJIJI();
        LJIJJ();
    }

    public final void LJIL() {
        List<InterfaceC2179261AQq> listLIZIZ;
        InterfaceC2179261AQq interfaceC2179261AQq = this.LJIILIIL;
        InterfaceC2179131AQd interfaceC2179131AQd = this.LJIIL;
        if (interfaceC2179131AQd != null && (listLIZIZ = interfaceC2179131AQd.LIZIZ()) != null) {
            Iterator<InterfaceC2179261AQq> it2 = listLIZIZ.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (!Intrinsics.LJFF(it2.next().getId(), interfaceC2179261AQq != null ? interfaceC2179261AQq.getId() : null)) {
                    i++;
                } else if (i != -1) {
                    if (interfaceC2179261AQq != null) {
                        C2179281AQs c2179281AQs = this.LIZJ;
                        if (c2179281AQs != null) {
                            c2179281AQs.LJIJI(interfaceC2179261AQq, null);
                        }
                    } else {
                        interfaceC2179261AQq = null;
                    }
                    this.LJIILIIL = interfaceC2179261AQq;
                    return;
                }
            }
        }
        C2179111AQb c2179111AQb = new C2179111AQb(interfaceC2179261AQq);
        this.LJIIL = c2179111AQb;
        C2179281AQs c2179281AQs2 = this.LIZJ;
        if (c2179281AQs2 != null) {
            c2179281AQs2.LJJIJIL(c2179111AQb);
        }
    }

    @Override // X.InterfaceC2178171AMl
    public final int getDuration() {
        C2179281AQs c2179281AQs = this.LIZJ;
        if (c2179281AQs != null) {
            return (int) c2179281AQs.getDuration();
        }
        return 0;
    }

    @Override // X.InterfaceC2178171AMl
    public final void pause() {
        C2179281AQs c2179281AQs = this.LIZJ;
        if (c2179281AQs != null) {
            c2179281AQs.LJIIIIZZ(null);
        }
    }

    @Override // X.InterfaceC2178171AMl
    public final void play() throws JSONException {
        C2179281AQs c2179281AQs = this.LIZJ;
        String id = null;
        if (c2179281AQs != null) {
            c2179281AQs.LJII(null);
        }
        if (this.LIZJ == null) {
            InterfaceC2179261AQq interfaceC2179261AQq = this.LJIILIIL;
            if (interfaceC2179261AQq != null) {
                id = interfaceC2179261AQq.getPlayUrl();
            } else {
                InterfaceC2179131AQd interfaceC2179131AQd = this.LJIIL;
                if (interfaceC2179131AQd != null) {
                    id = interfaceC2179131AQd.getId();
                }
            }
            this.LJII.LIZIZ(-6, -1, this.LJI.getDesc(), "player not attach or already be detached", id, this.LJIILL);
        }
        if (this.LJIILIIL == null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", "-4");
            jSONObject.put("playerType", this.LJI.getDesc());
            jSONObject.put("autoPlay", String.valueOf(this.LJIILL));
            jSONObject.put("message", "src is empty");
            jSONObject.put("src", "");
            jSONObject.put("playStatus", "-1");
            this.LJII.LIZ(jSONObject);
            C2178901APg.LIZIZ("AUDIO_MONITOR_TAG", "eventName: x_audio_error, error msg :src is empty");
        }
    }

    @Override // X.InterfaceC2178171AMl
    public final void stop() {
        C2179281AQs c2179281AQs = this.LIZJ;
        if (c2179281AQs != null) {
            c2179281AQs.LIZLLL(null);
        }
    }

    public static C1ANG LIZLLL(C1ANF c1anf) {
        if (c1anf != null) {
            int i = C1ANC.LIZJ[c1anf.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return C1ANG.PLAYBACK_STATE_ERROR;
                            }
                        } else {
                            return C1ANG.PLAYBACK_STATE_STOPPED;
                        }
                    } else {
                        return C1ANG.PLAYBACK_STATE_PAUSED;
                    }
                } else {
                    return C1ANG.PLAYBACK_STATE_PLAYING;
                }
            } else {
                return C1ANG.PLAYBACK_STATE_START;
            }
        }
        return C1ANG.PLAYBACK_STATE_STOPPED;
    }

    @Override // X.InterfaceC2178171AMl
    public final void LJ(int i) {
        C2179281AQs c2179281AQs = this.LIZJ;
        if (c2179281AQs != null) {
            c2179281AQs.LJJ(i, null);
        }
    }

    @Override // X.InterfaceC2178171AMl
    public final void LJII(boolean z) {
        this.LJIIZILJ = z;
        LJIJ();
    }

    @Override // X.InterfaceC2178171AMl
    public final void LJIIIIZZ(EnumC2178191AMn enumC2178191AMn) {
        C1AQY c1aqy;
        C2179281AQs c2179281AQs;
        int i = C1ANC.LIZ[enumC2178191AMn.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    c1aqy = C1AQY.LIST_LOOP;
                } else {
                    throw new C1954807lC();
                }
            } else {
                c1aqy = C1AQY.SEQUENCE;
            }
        } else {
            c1aqy = C1AQY.SINGLE_LOOP;
        }
        this.LJIILJJIL = c1aqy;
        if (c1aqy != null && (c2179281AQs = this.LIZJ) != null) {
            c2179281AQs.LJJIJIIJI(c1aqy);
        }
    }

    @Override // X.InterfaceC2178171AMl
    public final void LJIIIZ(boolean z) {
        this.LJIILL = z;
    }

    @Override // X.InterfaceC2178171AMl
    public final void LJIIJ(String str) {
        this.LJFF = (List) LJIIZILJ(str, new TypeToken<List<? extends String>>() { // from class: X.1AQU
        }.getType());
        LJIJJ();
    }

    @Override // X.InterfaceC2178171AMl
    public final void LJIIJJI(String str) {
        InterfaceC2179131AQd playlist;
        C2179281AQs c2179281AQs;
        XAudioList xAudioList = (XAudioList) LJIIZILJ(str, XAudioList.class);
        if (xAudioList != null) {
            playlist = xAudioList.toPlaylist();
        } else {
            playlist = null;
        }
        this.LJIIL = playlist;
        if (playlist != null && (c2179281AQs = this.LIZJ) != null) {
            c2179281AQs.LJJIJIL(playlist);
        }
    }

    @Override // X.InterfaceC2178171AMl
    public final void LJIILJJIL(boolean z) {
        this.LJIILLIIL = z;
        LJIJI();
    }

    @Override // X.InterfaceC2178171AMl
    public final void LJIILL(InterfaceC2178251AMt interfaceC2178251AMt) {
        C1AN4 c1an4;
        if ((interfaceC2178251AMt instanceof C1AN4) && (c1an4 = (C1AN4) interfaceC2178251AMt) != null) {
            this.LJIIJJI = c1an4;
            LJIJJLI();
        }
    }

    @Override // X.InterfaceC2178171AMl
    public final void LJIILLIIL(C1ANB c1anb) {
        InterfaceC2178461ANo c2178451ANn;
        this.LJI = c1anb;
        C2179281AQs c2179281AQs = this.LIZJ;
        if (c2179281AQs != null) {
            int i = C1ANC.LIZIZ[c1anb.ordinal()];
            if (i != 1 && i != 2) {
                c2178451ANn = new C2178451ANn();
            } else {
                c2178451ANn = new InterfaceC2178461ANo() { // from class: X.1AQc
                    @Override // X.InterfaceC2178461ANo
                    public final InterfaceC2179221AQm LIZ(Context context, C2179181AQi c2179181AQi) {
                        return new C1ARZ(context, c2179181AQi);
                    }
                };
            }
            c2179281AQs.LJJIJIIJIL(c2178451ANn);
        }
    }

    @Override // X.InterfaceC2178171AMl
    public final void setSrc(String str) {
        this.LJIILIIL = (InterfaceC2179261AQq) LJIIZILJ(str, XAudioSrc.class);
        LJIL();
    }

    public final <T> T LJIIZILJ(String str, Type type) {
        try {
            return (T) ((Gson) this.LJIIJ.getValue()).LJIIIIZZ(str, type);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LJII.LIZIZ(-7, -1, this.LJI.getDesc(), "json format error", str, this.LJIILL);
            return null;
        }
    }

    public C1AQV(Context context, s sVar, int i) {
        this.LIZ = context;
        this.LJII = new C1AOB(i, sVar);
    }
}
