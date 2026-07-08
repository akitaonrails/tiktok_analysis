package X;

import Y.AObjectS240S0100000_5;
import Y.AObserverS209S0100000_5;
import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commerce.tools.music.ICommerceToolsMusicService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS20S0001000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FCU, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FCU extends C0ETX<C0EUG, C386200FCg, C0FCZ, InterfaceC386220FCi> implements InterfaceC19547311dn, C0FF5, C0EUG {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public static final int LLLFFI;
    public final Activity LLJJJJJIL;
    public final C1DRG LLJJJJLIIL;
    public final C01GW LLJJL;
    public final InterfaceC1731706qJ LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public List<Effect> LLJLL;
    public String LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public C386190FCf LLJZIJLIL;
    public final C01GW LLL;
    public String LLLF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0FCU.class, "panelContext", "getPanelContext()Lcom/ss/android/ugc/gamora/editorpro/capabilities/audio/voiceeffect/VoiceEffectPanelContext;", 0);
        C13LE.LIZ.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLFFI = 8;
    }

    @Override // X.C0FF5
    public void LLLII(C19536311c1 c19536311c1, String str, Function2<? super Effect, ? super AudioEffectParam, Unit> function2) {
    }

    @Override // X.InterfaceC19547311dn
    public void Q1(int i, String str) {
    }

    public C0EUG R5() {
        return this;
    }

    public void dF1() {
    }

    @Override // X.InterfaceC19547311dn
    public void pause() {
    }

    @Override // X.InterfaceC19547311dn
    public void play() {
    }

    @Override // X.InterfaceC19547311dn
    public INLEPlayer w0() {
        return null;
    }

    private final void K6() {
        i3(AFwS234S0000000_5.get$arr$(181));
        N5(false);
    }

    private final String U5() {
        return (String) this.LLJLLL.getValue();
    }

    @Override // ge.i
    public Function0<C386200FCg> E3() {
        return new AwS549S0100000_5(this, 425);
    }

    public final C386200FCg J6() {
        return (C386200FCg) this.LLJJL.getValue();
    }

    @Override // X.C0ETX
    public String O4() {
        String str = this.LLJLLIL;
        if (str == null) {
            str = "";
        }
        return C2292508yZ.LIZJ(this.LLJLIL ? new C0E1X(C0E1V.APPLYTOALL_VOICE_EFFECT.getNameId(), null, null, str, null, 22) : new C0E1X(C0E1V.APPLY_VOICE_EFFECT.getNameId(), null, null, str, null, 22));
    }

    public final C0EUA d6() {
        return (C0EUA) this.LLJJLIIIJLLLLLLLZ.getValue(this, LLLFF[0]);
    }

    public final C19538011cI m6() {
        return (C19538011cI) this.LLJZ.getValue();
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C0FCZ> o2() {
        return AFwS191S0000000_5.get$arr$(128);
    }

    public final C19536511c3 u6() {
        return (C19536511c3) this.LLL.getValue();
    }

    @Override // X.AbstractC1664470tPp
    public Function0<InterfaceC386220FCi> w2() {
        return new AwS549S0100000_5(this, 424);
    }

    private final void L6() {
        LiveEvent<Pair<EnumC357140DzM, Boolean>> liveEventEb1;
        MutableLiveData mutableLiveDataLIZ;
        MutableLiveData mutableLiveDataLIZ2;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null && (mutableLiveDataLIZ2 = c0e48F4.S7().LIZ("selected_nle_track_slot")) != null) {
            mutableLiveDataLIZ2.observe(this, new AObserverS209S0100000_5(this, 45));
        }
        C0E48 c0e48F42 = F4();
        if (c0e48F42 != null && (mutableLiveDataLIZ = c0e48F42.S7().LIZ("track_select_change_event")) != null) {
            mutableLiveDataLIZ.observe(this, new AObserverS209S0100000_5(this, 46));
        }
        InterfaceC357900E1k interfaceC357900E1kH4 = H4();
        if (interfaceC357900E1kH4 == null || (liveEventEb1 = interfaceC357900E1kH4.eb1()) == null) {
            return;
        }
        liveEventEb1.LIZ(this, new AObjectS240S0100000_5(this, 65));
    }

    private final C19754712Qv S5() {
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
        return videoPublishEditModelLJJJLIIL != null ? C12QV.LIZ(videoPublishEditModelLJJJLIIL, null, false) : new C19754712Qv(false, false, 14);
    }

    public final void H5() {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        NLEResourceAV aVFile;
        NLEResourceNode resource;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 == null || (nLETrackSlotLLLLLLIL = c0e48F4.LLLLLLIL()) == null) {
            return;
        }
        NLESegment mainSegment = nLETrackSlotLLLLLLIL.getMainSegment();
        NLEResType resourceType = (mainSegment == null || (resource = mainSegment.getResource()) == null) ? null : resource.getResourceType();
        boolean z = resourceType == NLEResType.IMAGE;
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotLLLLLLIL.getMainSegment());
        boolean z2 = (nLESegmentVideoDynamicCast == null || (aVFile = nLESegmentVideoDynamicCast.getAVFile()) == null || !aVFile.getHasAudio()) ? false : true;
        if (z || (resourceType == NLEResType.VIDEO && !z2)) {
            J6().LLLLLJLJLL().LJIIZILJ(new C19754712Qv(false, false, 14));
        } else {
            J6().LLLLLJLJLL().LJIIZILJ(new C19754712Qv(true, false, 14));
        }
        C0E2R c0e2rT4 = T4();
        if (c0e2rT4 != null) {
            c0e2rT4.cD(z ? 0.4f : 1.0f);
        }
    }

    @Override // X.C0ETX
    public boolean d5() {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null && (nLETrackSlotLLLLLLIL = c0e48F4.LLLLLLIL()) != null && C351220Dpo.LLJJIJIL(nLETrackSlotLLLLLLIL)) {
            return false;
        }
        int iLIZIZ = J6().LLLLLJLJLL().LIZIZ();
        C1664150tPJ c1664150tPJLJIILIIL = J6().LLLLLJLJLL().LJIILIIL(iLIZIZ);
        if (iLIZIZ != -1 && c1664150tPJLJIILIIL != null) {
            this.LLJL = true;
            T6(iLIZIZ, c1664150tPJLJIILIIL);
            this.LLJL = false;
            return false;
        }
        C0E48 c0e48F42 = F4();
        C349080DmM.LIZJ(c0e48F42 != null ? C350870DpF.LJI(c0e48F42) : null);
        M5(true);
        Activity activity = this.LLJJJJJIL;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(2131833382);
        C1390380mHk.LIZ(activity, 1057, creativeToastBuilder);
        return false;
    }

    @Override // X.C0ETX
    public void n5() {
        VideoPublishEditModel videoPublishEditModelLJJJLIIL;
        String extra;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null && (videoPublishEditModelLJJJLIIL = LJJJLIIL()) != null) {
            C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelLJJJLIIL, c0e48F4, new Pair(-1, -1));
            NLETrack nLETrackLIZLLL = C350890DpH.LIZLLL(c0e48F4);
            if (nLETrackLIZLLL == null || (extra = nLETrackLIZLLL.getExtra("ep_audio_music_id")) == null) {
                extra = "";
            }
            c0labLJFF.LJ("music_id", extra);
            String enterFrom = videoPublishEditModelLJJJLIIL.getEnterFrom();
            c0labLJFF.LJ("enter_from", enterFrom != null ? enterFrom : "");
            c0labLJFF.LJ("is_editor_pro", "1");
            C20684815ws.LJIILLIIL("cancel_voice_effect", c0labLJFF.LIZ);
        }
        super.n5();
    }

    @Override // X.C0ETX, ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        K6();
        L6();
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        R5();
        return this;
    }

    @Override // X.C0ETX, X.C0ETZ, X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJJJJLIIL;
    }

    private final boolean E5(List<C19536311c1> list) {
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<C19536311c1> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (m6().LIZIZ(it2.next()) == null) {
                    z = true;
                    break;
                }
            }
        }
        return !z;
    }

    public final void M5(boolean z) {
        C0E1X c0e1x;
        NLEEditor nLEEditorLJI;
        NLEEditor nLEEditorLJI2;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null && (nLEEditorLJI2 = c0e48F4.LLFII().LJI()) != null) {
            nLEEditorLJI2.commit();
        }
        if (C0E2B.LIZ()) {
            String str = this.LLJLLIL;
            if (str == null) {
                str = "";
            }
            if (z) {
                c0e1x = new C0E1X(C0E1V.APPLYTOALL_VOICE_EFFECT.getNameId(), null, null, str, null, 22);
            } else {
                c0e1x = new C0E1X(C0E1V.APPLY_VOICE_EFFECT.getNameId(), null, null, str, null, 22);
            }
            C0E48 c0e48F42 = F4();
            if (c0e48F42 != null && (nLEEditorLJI = c0e48F42.LLFII().LJI()) != null) {
                C350410DoV.LIZLLL(nLEEditorLJI, true, C2292508yZ.LIZJ(c0e1x), true, true);
            }
        }
    }

    public final void N5(boolean z) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        boolean zHasExtra;
        String extra;
        C19754712Qv c19754712QvS5 = S5();
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null) {
            nLETrackSlotLLLLLLIL = c0e48F4.LLLLLLIL();
        } else {
            nLETrackSlotLLLLLLIL = null;
        }
        if (nLETrackSlotLLLLLLIL != null) {
            zHasExtra = nLETrackSlotLLLLLLIL.hasExtra("extra_voice_chang_effect_id");
        } else {
            zHasExtra = false;
        }
        Effect effect = new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0L, null, null, 0L, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0L, null, null, null, 0L, 0L, null, null, null, null, null, false, false, -1, -1, 15, null);
        if (zHasExtra) {
            if (nLETrackSlotLLLLLLIL == null || (extra = nLETrackSlotLLLLLLIL.getExtra("extra_voice_chang_effect_id")) == null) {
                extra = "";
            }
            effect.setEffectId(extra);
        }
        J6().LLLLLJLJLL().LJIIIIZZ(false, new C0FCT(this, z, c19754712QvS5, effect));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S6(X.EnumC357140DzM r93) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FCU.S6(X.0DzM):void");
    }

    @Override // X.C0ETX
    public void t5(boolean z) {
        VideoPublishEditModel videoPublishEditModelLJJJLIIL;
        String extra;
        C0E48 c0e48F4 = F4();
        if (c0e48F4 != null && (videoPublishEditModelLJJJLIIL = LJJJLIIL()) != null) {
            C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelLJJJLIIL, c0e48F4, new Pair(-1, -1));
            c0labLJFF.LJ("is_editor_pro", "1");
            NLETrack nLETrackLIZLLL = C350890DpH.LIZLLL(c0e48F4);
            String str = "";
            if (nLETrackLIZLLL == null || (extra = nLETrackLIZLLL.getExtra("ep_audio_music_id")) == null) {
                extra = "";
            }
            c0labLJFF.LJ("music_id", extra);
            String enterFrom = videoPublishEditModelLJJJLIIL.getEnterFrom();
            if (enterFrom != null) {
                str = enterFrom;
            }
            c0labLJFF.LJ("enter_from", str);
            C20684815ws.LJIILLIIL("save_voice_effect", c0labLJFF.LIZ);
        }
        super.t5(z);
    }

    private final void N6(boolean z, Effect effect) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        NLEResType resourceType;
        boolean z2;
        String shootWay;
        String contentSource;
        String storyShootEntrance;
        String str;
        String contentType;
        NLEResourceNode resource;
        if (effect == null) {
            return;
        }
        if (z) {
            VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
            if (videoPublishEditModelLJJJLIIL != null) {
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("creation_id", videoPublishEditModelLJJJLIIL.getCreationId());
                c0lab.LJ("scene_from", "editor_pro");
                C20684815ws.LJIILLIIL("voice_effect_apply", c0lab.LIZ);
                return;
            }
            return;
        }
        C0E48 c0e48F4 = F4();
        if (c0e48F4 == null || (nLETrackSlotLLLLLLIL = c0e48F4.LLLLLLIL()) == null) {
            return;
        }
        NLESegment mainSegment = nLETrackSlotLLLLLLIL.getMainSegment();
        if (mainSegment != null && (resource = mainSegment.getResource()) != null) {
            resourceType = resource.getResourceType();
        } else {
            resourceType = null;
        }
        if (resourceType == NLEResType.VIDEO) {
            z2 = true;
        } else {
            z2 = false;
        }
        VideoPublishEditModel videoPublishEditModelLJJJLIIL2 = LJJJLIIL();
        if (videoPublishEditModelLJJJLIIL2 == null || F4() == null) {
            return;
        }
        C0LAB c0lab2 = new C0LAB();
        c0lab2.LJ("enter_from", "video_edit_page");
        c0lab2.LJ("effect_name", effect.getName());
        c0lab2.LJ("effect_id", effect.getEffectId());
        AVETParameter avetParameter = videoPublishEditModelLJJJLIIL2.getAvetParameter();
        String str2 = "";
        if (avetParameter == null || (shootWay = avetParameter.getShootWay()) == null) {
            shootWay = "";
        }
        c0lab2.LJ("shoot_way", shootWay);
        String creationId = videoPublishEditModelLJJJLIIL2.getCreationId();
        if (creationId == null) {
            creationId = "";
        }
        c0lab2.LJ("creation_id", creationId);
        AVETParameter avetParameter2 = videoPublishEditModelLJJJLIIL2.getAvetParameter();
        if (avetParameter2 == null || (contentSource = avetParameter2.getContentSource()) == null) {
            contentSource = "";
        }
        c0lab2.LJ("content_source", contentSource);
        AVETParameter avetParameter3 = videoPublishEditModelLJJJLIIL2.getAvetParameter();
        if (avetParameter3 == null || (storyShootEntrance = avetParameter3.getStoryShootEntrance()) == null) {
            storyShootEntrance = "";
        }
        c0lab2.LJ("shoot_entrance", storyShootEntrance);
        AVETParameter avetParameter4 = videoPublishEditModelLJJJLIIL2.getAvetParameter();
        if (avetParameter4 != null && (contentType = avetParameter4.getContentType()) != null) {
            str2 = contentType;
        }
        c0lab2.LJ("content_type", str2);
        c0lab2.LIZIZ(System.currentTimeMillis(), "local_time_ms");
        c0lab2.LJ("is_editor_pro", "1");
        if (z2) {
            str = "video";
        } else {
            str = "record";
        }
        c0lab2.LJ("select_from", str);
        C20684815ws.LJIILLIIL("select_voice_effect", c0lab2.LIZ);
    }

    public final void P6(int i, List<Integer> list) {
        VideoPublishEditModel videoPublishEditModelLJJJLIIL;
        Iterator<Effect> it2 = this.LLJLL.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            it2.next();
            int i3 = i2 + 1;
            if (i2 >= 0) {
                if (list.contains(Integer.valueOf(i2))) {
                    if (this.LLJZIJLIL == null && (videoPublishEditModelLJJJLIIL = LJJJLIIL()) != null) {
                        this.LLJZIJLIL = new C386190FCf(videoPublishEditModelLJJJLIIL);
                    }
                    Effect effect = (Effect) ListProtector.get(this.LLJLL, i2);
                    C386190FCf c386190FCf = this.LLJZIJLIL;
                    if (c386190FCf != null) {
                        String strLIZ = C194396113q.LIZ(effect);
                        if (strLIZ == null) {
                            strLIZ = "";
                        }
                        c386190FCf.LIZ(1, strLIZ, effect.getEffectId(), effect.getName());
                    }
                }
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final void T6(final int i, C1664150tPJ c1664150tPJ) {
        String name;
        boolean z;
        Effect effect;
        VideoPublishEditModel videoPublishEditModelLJJJLIIL;
        String effectId;
        String str;
        VecNLETrackSlotSPtr slots;
        if (c1664150tPJ.LJ == 1) {
            return;
        }
        Effect effect2 = c1664150tPJ.LIZ;
        String strLIZJ = null;
        if (effect2 != null) {
            name = effect2.getName();
        } else {
            name = null;
        }
        this.LLJLLIL = name;
        if (name == null || name.length() == 0) {
            this.LLJLLIL = U5();
        }
        final C0E48 c0e48F4 = F4();
        if (c0e48F4 == null) {
            return;
        }
        final NLEModel nLEModelLJI = C350870DpF.LJI(c0e48F4);
        NLETrackSlot nLETrackSlotLLLLLLIL = c0e48F4.LLLLLLIL();
        if (nLETrackSlotLLLLLLIL == null) {
            return;
        }
        final String extra = nLETrackSlotLLLLLLIL.getExtra("extra_voice_chang_effect_id");
        String str2 = "";
        if (extra == null) {
            extra = "";
        }
        Activity activity = this.LLJJJJJIL;
        N6(this.LLJL, c1664150tPJ.LIZ);
        boolean z2 = this.LLJL;
        this.LLJLIL = z2;
        if (c1664150tPJ.LJII && !z2) {
            z = true;
        } else {
            z = false;
        }
        if (!c1664150tPJ.LIZJ && !z) {
            final Effect effect3 = c1664150tPJ.LIZ;
            if (effect3 == null) {
                return;
            }
            if (c1664150tPJ.LJFF == 1) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.message(activity.getResources().getString(2131822393));
                C1390380mHk.LIZ(activity, 3066, creativeToastBuilder);
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (this.LLJL) {
                NLETrack mainTrack = nLEModelLJI.getMainTrack();
                if (mainTrack != null && (slots = mainTrack.getSlots()) != null) {
                    for (NLETrackSlot nLETrackSlotLIZIZ : slots) {
                        if (C351220Dpo.LLIFFJFJJ(nLETrackSlotLIZIZ)) {
                            nLETrackSlotLIZIZ = C348930Dm7.LIZIZ(nLEModelLJI, nLETrackSlotLIZIZ);
                        }
                        if (nLETrackSlotLIZIZ != null) {
                            arrayList.add(new C19536311c1(null, effect3, C348930Dm7.LJII(nLETrackSlotLIZIZ)));
                        }
                    }
                }
                Iterator it2 = ((ArrayList) C349080DmM.LJI(nLEModelLJI)).iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C19536311c1((NLETrackSlot) it2.next(), effect3, null));
                }
            } else {
                NLETrack nLETrackPt = c0e48F4.Pt();
                if (nLETrackPt != null && nLETrackPt.getMainTrack()) {
                    if (!C351220Dpo.LLIFFJFJJ(nLETrackSlotLLLLLLIL) || (nLETrackSlotLLLLLLIL = C348930Dm7.LIZIZ(nLEModelLJI, nLETrackSlotLLLLLLIL)) != null) {
                        arrayList.add(new C19536311c1(null, effect3, C348930Dm7.LJII(nLETrackSlotLLLLLLIL)));
                    }
                } else {
                    arrayList.add(new C19536311c1(nLETrackSlotLLLLLLIL, effect3, null));
                }
            }
            final boolean z3 = this.LLJL;
            if (arrayList.isEmpty()) {
                return;
            }
            boolean zE5 = E5(arrayList);
            C0EUA c0euaD6 = d6();
            if (c0euaD6 != null && (str = c0euaD6.LL) != null) {
                str2 = str;
            }
            C0EU5.LIZIZ(c0e48F4, str2, null, zE5);
            C19536511c3 c19536511c3U6 = u6();
            if (c19536511c3U6 != null) {
                strLIZJ = c19536511c3U6.LIZJ(arrayList, new InterfaceC1219340hps() { // from class: X.0FCV
                    @Override // X.InterfaceC1219340hps
                    public final void LIZ(int i2, int i3) {
                    }

                    @Override // X.InterfaceC1219340hps
                    public final void onCancel() {
                    }

                    @Override // X.InterfaceC1219340hps
                    public final void onStart(int i2) {
                        if (i2 == 1) {
                            this.LIZ.i3(AFwS234S0000000_5.get$arr$(186));
                        }
                    }

                    @Override // X.InterfaceC1219340hps
                    public final void LIZIZ(int i2, int i3) {
                        if (i2 != 0) {
                            if (i2 == 1) {
                                this.LIZ.J6().LLLLLJLJLL().LJIILLIIL(i, 1);
                                this.LIZ.i3(new AwS20S0001000_5(i3, 11));
                                return;
                            }
                            return;
                        }
                        this.LIZ.J6().LLLLLJLJLL().LJIILLIIL(i, 2);
                    }

                    @Override // X.InterfaceC1219340hps
                    public final void LIZJ(int i2, List list) {
                        VideoPublishEditModel videoPublishEditModelLJJJLIIL2;
                        VideoPublishEditModel videoPublishEditModelLJJJLIIL3;
                        if (i2 != 0) {
                            if (i2 == 1) {
                                this.LIZ.i3(AFwS234S0000000_5.get$arr$(187));
                                Iterator it3 = list.iterator();
                                while (it3.hasNext()) {
                                    C19536311c1 c19536311c1 = (C19536311c1) it3.next();
                                    if (c19536311c1.LIZIZ != null) {
                                        C349080DmM.LIZIZ(c19536311c1, C350870DpF.LJFF(c0e48F4), EnumC356240Dxu.EDITOR_PRO, true);
                                    } else {
                                        C350870DpF.LJFF(c0e48F4);
                                        C349080DmM.LIZ(c19536311c1, EnumC356240Dxu.EDITOR_PRO);
                                    }
                                }
                                this.LIZ.M5(z3);
                            }
                        } else {
                            this.LIZ.J6().LLLLLJLJLL().LJIILLIIL(i, 1);
                            Iterator it4 = list.iterator();
                            while (it4.hasNext()) {
                                it4.next();
                            }
                        }
                        this.LIZ.J6().LLLLLJLJLL().LIZJ(i);
                        C0E55 player = c0e48F4.getPlayer();
                        if (player == null) {
                            return;
                        }
                        if (z3) {
                            if (this.LIZ.getLifecycle().getCurrentState() == Lifecycle.State.RESUMED) {
                                player.ba(0L, new C0FX3(player, 3));
                            }
                            Activity activity2 = this.LIZ.LLJJJJJIL;
                            CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                            creativeToastBuilder2.messageRes(2131833382);
                            C1390380mHk.LIZ(activity2, 1057, creativeToastBuilder2);
                            VideoPublishEditModel videoPublishEditModelLJJJLIIL4 = this.LIZ.LJJJLIIL();
                            if (videoPublishEditModelLJJJLIIL4 != null) {
                                C1446150njh.LIZIZ(videoPublishEditModelLJJJLIIL4);
                            }
                            VideoPublishEditModel videoPublishEditModelLJJJLIIL5 = this.LIZ.LJJJLIIL();
                            if (videoPublishEditModelLJJJLIIL5 != null) {
                                AudioEffectParam audioEffectParam = new AudioEffectParam("", 0, 0, "", "", 0, 0, null, null, new ArrayList());
                                Effect effect4 = effect3;
                                audioEffectParam.setEffectPath(effect4.getUnzipPath());
                                audioEffectParam.setUploadId(effect4.getEffectId());
                                videoPublishEditModelLJJJLIIL5.setVeAudioEffectParam(audioEffectParam);
                            }
                        } else {
                            if (this.LIZ.getLifecycle().getCurrentState() == Lifecycle.State.RESUMED) {
                                player.LJIJJ();
                            }
                            VideoPublishEditModel videoPublishEditModelLJJJLIIL6 = this.LIZ.LJJJLIIL();
                            if ((videoPublishEditModelLJJJLIIL6 == null || videoPublishEditModelLJJJLIIL6.getVeAudioEffectParam() == null) && (videoPublishEditModelLJJJLIIL2 = this.LIZ.LJJJLIIL()) != null) {
                                videoPublishEditModelLJJJLIIL2.setVeAudioEffectParam(new AudioEffectParam("", 0, 0, "", "", 0, 0, null, null, new ArrayList()));
                            }
                            List listLJII = C349080DmM.LJII(nLEModelLJI);
                            String str3 = extra;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : (ArrayList) listLJII) {
                                if (Intrinsics.LJFF(obj, str3)) {
                                    arrayList2.add(obj);
                                }
                            }
                            boolean z4 = !arrayList2.isEmpty();
                            C0FCU c0fcu = this.LIZ;
                            List<Effect> list2 = c0fcu.LLJLL;
                            String str4 = extra;
                            for (Effect effect5 : list2) {
                                if (Intrinsics.LJFF(effect5.getEffectId(), str4) && !z4 && (videoPublishEditModelLJJJLIIL3 = c0fcu.LJJJLIIL()) != null) {
                                    C1446150njh.LIZJ(videoPublishEditModelLJJJLIIL3, effect5);
                                }
                            }
                        }
                        VideoPublishEditModel videoPublishEditModelLJJJLIIL7 = this.LIZ.LJJJLIIL();
                        if (videoPublishEditModelLJJJLIIL7 != null) {
                            C1446150njh.LIZ(this.LIZ, videoPublishEditModelLJJJLIIL7, effect3);
                        }
                    }

                    @Override // X.InterfaceC1219340hps
                    public final void LIZLLL(int i2, C19536611c4 c19536611c4) {
                        if (i2 != 0) {
                            if (i2 == 1) {
                                this.LIZ.i3(AFwS234S0000000_5.get$arr$(185));
                                Activity activity2 = this.LIZ.LLJJJJJIL;
                                if (activity2 != null) {
                                    CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                                    creativeToastBuilder2.messageRes(2131826993);
                                    creativeToastBuilder2.isTuxToastLegacy(true);
                                    C1390380mHk.LIZ(activity2, 3066, creativeToastBuilder2);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        this.LIZ.J6().LLLLLJLJLL().LJIILLIIL(i, 3);
                        Activity activity3 = this.LIZ.LLJJJJJIL;
                        if (activity3 == null) {
                            return;
                        }
                        CreativeToastBuilder creativeToastBuilder3 = new CreativeToastBuilder();
                        creativeToastBuilder3.messageRes(2131826992);
                        creativeToastBuilder3.isTuxToastLegacy(true);
                        C1390380mHk.LIZ(activity3, 3066, creativeToastBuilder3);
                    }
                });
            }
            this.LLLF = strLIZJ;
            return;
        }
        if (z2) {
            C349080DmM.LIZJ(nLEModelLJI);
        } else {
            NLETrack nLETrackPt2 = c0e48F4.Pt();
            if (nLETrackPt2 != null && nLETrackPt2.getMainTrack()) {
                C349070DmL.LIZ(nLEModelLJI, nLETrackSlotLLLLLLIL, true);
            } else {
                C349080DmM.LJ(nLETrackSlotLLLLLLIL);
            }
        }
        M5(this.LLJL);
        if (z) {
            J6().LLLLLJLJLL().LJ();
        } else {
            J6().LLLLLJLJLL().LIZJ(i);
        }
        List listLJII = C349080DmM.LJII(nLEModelLJI);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : (ArrayList) listLJII) {
            Effect effect4 = c1664150tPJ.LIZ;
            if (effect4 != null) {
                effectId = effect4.getEffectId();
            } else {
                effectId = null;
            }
            if (Intrinsics.LJFF(obj, effectId)) {
                arrayList2.add(obj);
            }
        }
        if (!(!arrayList2.isEmpty()) && (effect = c1664150tPJ.LIZ) != null && (videoPublishEditModelLJJJLIIL = LJJJLIIL()) != null) {
            C1446150njh.LIZJ(videoPublishEditModelLJJJLIIL, effect);
        }
    }

    public final boolean W6(Effect effect, C19754712Qv c19754712Qv) {
        boolean zYi2;
        boolean z;
        ICommerceToolsMusicService iCommerceToolsMusicService = (ICommerceToolsMusicService) PluggableExtentionKt.pluggableSpi$default(ICommerceToolsMusicService.class, false, false, false, 14, null);
        if (iCommerceToolsMusicService != null) {
            zYi2 = iCommerceToolsMusicService.yi2();
        } else {
            zYi2 = false;
        }
        if (zYi2 && C1664460tPo.LIZJ(effect)) {
            return true;
        }
        boolean zLJFF = C1664460tPo.LJFF(effect);
        if (!C0CHQ.LIZ().getAccountService().LIZ() && ((Number) C0BVW.LIZ.getValue()).intValue() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (zLJFF && !z) {
            return true;
        }
        if (c19754712Qv == null || !c19754712Qv.LIZLLL || !zLJFF) {
            return false;
        }
        return true;
    }

    public C0FCU(C19A3 c19a3, Activity activity, C1DRG c1drg) {
        super(c19a3, c1drg, true);
        this.LLJJJJJIL = activity;
        this.LLJJJJLIIL = c1drg;
        this.LLJJL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 427));
        this.LLJJLIIIJLLLLLLLZ = C1664770tQJ.LIZIZ(getDiContainer(), C0EUA.class, null);
        this.LLJLL = new ArrayList();
        this.LLJLLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 423));
        this.LLJZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(129));
        this.LLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 426));
    }
}
