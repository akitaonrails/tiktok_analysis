package X;

import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0UEP, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UEP extends C0UEN {
    public int LJI;
    public LiveEffect.StickerSDKExtra LJIIIIZZ;
    public String LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;
    public Integer LJIJ;
    public String LJIJI;
    public C0U6H LJIL;
    public String LJJ;
    public String LJJI;
    public int LJJIIZ;
    public boolean LJJIIZI;
    public boolean LJJIJ;
    public int LJJIJIIJIL;
    public WeakReference<InterfaceC767600U9e> LJJIJIL;
    public List<? extends LiveEffect> LJJIJL;
    public Integer LJJIJLIJ;
    public long LJFF = -1;
    public List<LiveEffect.ComposerConfig> LJII = C13BV.INSTANCE;
    public String LJIIIZ = "";
    public ArrayList<String> LJIIJ = new ArrayList<>();
    public String LJIIZILJ = "";
    public C767720U9q LJIJJ = new C767720U9q();
    public C0U9E LJIJJLI = C0U9E.NORMAL;
    public int LJJIFFI = -1;
    public long LJJII = -1;
    public long LJJIII = -1;
    public String LJJIIJ = "";
    public String LJJIIJZLJL = "";
    public final List<Integer> LJJIJIIJI = new ArrayList();

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LJIJI() {
        LLLJ(1024, true);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LJJII(String str) {
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final int LJJJ() {
        return R.drawable.ek1;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final boolean LJJJJLI() {
        return LLLIZZ(2);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LJJLIIIIJ() {
        LLLJ(524288, true);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final boolean LJJLIIIJ() {
        return LLLIZZ(4);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LJLLILLLL() {
        LLLJ(256, true);
    }

    @Override // X.C0UEN, X.C0UIP
    public final void LLIFFJFJJ(String str) {
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LLIIIILZ(String str) {
    }

    @Override // X.C0UEN, X.C0UIP
    public final void LLIIIJ(long j) {
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LLIIJI(int i) {
    }

    @Override // X.C0UEN, X.C0UIP
    public final void LLILLIZIL(long j) {
    }

    @Override // X.C0UEN, X.C0UIP
    public final String LLILZIL() {
        return "";
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final boolean LLJJIJIL() {
        return LLLIZZ(1);
    }

    @Override // X.C0UEN, X.C0UIP
    public final void LLJJJIL(long j) {
    }

    @Override // X.C0UEN, X.C0UIP
    public final long getGiftId() {
        return -1L;
    }

    @Override // X.C0UEN, X.C0UIP
    public final long getMsgId() {
        return -1L;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void setFilePath(String str) {
    }

    @Override // X.C0UEN, X.C0U7B
    public final List<String> LIZ() {
        Effect effect = this.LIZJ;
        if (effect != null) {
            return effect.getChildren();
        }
        return null;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String LIZIZ() {
        String hint;
        Effect effect = this.LIZJ;
        return (effect == null || (hint = effect.getHint()) == null) ? "" : hint;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final List<String> LIZJ() {
        Effect effect = this.LIZJ;
        if (effect != null) {
            return effect.getTypes();
        }
        return null;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final boolean LIZLLL() {
        return LLLIZZ(8192);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final boolean LJ() {
        return LLLIZZ(2097152);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final boolean LJIIIIZZ() {
        return LLLIZZ(128);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final boolean LJIIIZ() {
        return LLLIZZ(1024);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final boolean LJIILIIL() {
        return LLLIZZ(131072);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final Boolean LJIIZILJ() {
        return Boolean.valueOf(LLLIZZ(8));
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final boolean LJIJ() {
        return LLLIZZ(33554432);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final boolean LJJI() {
        return LLLIZZ(262144);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String LJJIII() {
        Effect effect = this.LIZJ;
        if (effect != null) {
            return effect.getSdkExtra();
        }
        return null;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final boolean LJJIJIIJI() {
        return LLLIZZ(64);
    }

    @Override // X.C0UEN, X.C0U7B
    public final String LJJIJLIJ() {
        InterfaceC767600U9e interfaceC767600U9e;
        WeakReference<InterfaceC767600U9e> weakReference = this.LJJIJIL;
        if (weakReference == null || (interfaceC767600U9e = weakReference.get()) == null) {
            return null;
        }
        return interfaceC767600U9e.getName();
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final boolean LJJJI() {
        return LLLIZZ(16);
    }

    @Override // X.C0UEN, X.C0U7B
    public final String LJJJJI() {
        InterfaceC767600U9e interfaceC767600U9e;
        WeakReference<InterfaceC767600U9e> weakReference = this.LJJIJIL;
        if (weakReference == null || (interfaceC767600U9e = weakReference.get()) == null) {
            return null;
        }
        return Long.valueOf(interfaceC767600U9e.getEffectId()).toString();
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final boolean LJJJJIZL() {
        return LLLIZZ(524288);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final boolean LJJJJLL() {
        if (LLLIZZ(32)) {
            return true;
        }
        LiveEffect.StickerSDKExtra stickerSDKExtra = this.LJIIIIZZ;
        return (stickerSDKExtra == null || stickerSDKExtra.pl == null) ? false : true;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String LJJJJZI() {
        String str = this.LJJI;
        return str == null ? "" : str;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final List<String> LJJJLIIL() {
        Effect effect = this.LIZJ;
        if (effect != null) {
            return effect.getChallenge();
        }
        return null;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final int LJJL() {
        Effect effect = this.LIZJ;
        if (effect != null) {
            return effect.getEffect_type();
        }
        return 0;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final boolean LJJLIIIJILLIZJL() {
        return LLLIZZ(512);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final boolean LJJLIIIJJI() {
        return LLLIZZ(134217728);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String LJJLIIIJL() {
        Effect effect = this.LIZJ;
        if (effect != null) {
            return effect.getDesignerId();
        }
        return null;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final List<String> LJJZZIII() {
        Effect effect = this.LIZJ;
        if (effect != null) {
            return effect.getBindIds();
        }
        return null;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final int LJL() {
        Effect effect = this.LIZJ;
        if (effect != null) {
            return effect.getHintFileFormat();
        }
        return 0;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String LJLJJL() {
        String tagsUpdatedAt;
        Effect effect = this.LIZJ;
        return (effect == null || (tagsUpdatedAt = effect.getTagsUpdatedAt()) == null) ? "" : tagsUpdatedAt;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String LJLJJLL() {
        Effect effect = this.LIZJ;
        if (effect != null) {
            return effect.getModel_names_sec();
        }
        return null;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final boolean LJLJL() {
        return LLLIZZ(4194304);
    }

    @Override // X.C0UEN, X.C0U7B
    public final boolean LJLJLJ() {
        return LLLIZZ(67108864);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final List<String> LJLLJ() {
        Effect effect = this.LIZJ;
        if (effect != null) {
            return effect.getTypes_sec();
        }
        return null;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final boolean LJLLL() {
        return LLLIZZ(1048576);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final List<String> LJLLLL() {
        Effect effect = this.LIZJ;
        if (effect != null) {
            return effect.getRequirements_sec();
        }
        return null;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final long LJLLLLLL() {
        Effect effect = this.LIZJ;
        if (effect != null) {
            return effect.getPtime();
        }
        return 0L;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String LJLZ() {
        String composerParams;
        Effect effect = this.LIZJ;
        return (effect == null || (composerParams = effect.getComposerParams()) == null) ? "" : composerParams;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String LLFFF() {
        String designerEncryptedId;
        Effect effect = this.LIZJ;
        return (effect == null || (designerEncryptedId = effect.getDesignerEncryptedId()) == null) ? "" : designerEncryptedId;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String LLFZ() {
        Effect effect = this.LIZJ;
        if (effect != null) {
            return effect.getOriginal_effect_id();
        }
        return null;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final boolean LLIILII() {
        return LLLIZZ(65536);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String LLIILZL() {
        String zipPath;
        Effect effect = this.LIZJ;
        return (effect == null || (zipPath = effect.getZipPath()) == null) ? "" : zipPath;
    }

    @Override // X.C0UEN, X.C0U7B
    public final String LLILII() {
        InterfaceC767600U9e interfaceC767600U9e;
        WeakReference<InterfaceC767600U9e> weakReference = this.LJJIJIL;
        if (weakReference == null || (interfaceC767600U9e = weakReference.get()) == null) {
            return null;
        }
        return interfaceC767600U9e.getResourceId();
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String LLILZLL() {
        String adRawData;
        Effect effect = this.LIZJ;
        return (effect == null || (adRawData = effect.getAdRawData()) == null) ? "" : adRawData;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String LLJI() {
        String id;
        Effect effect = this.LIZJ;
        return (effect == null || (id = effect.getId()) == null) ? "" : id;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final boolean LLJILLL() {
        return LLLIZZ(256);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final List<String> LLJJ() {
        List<String> requirements;
        Effect effect = this.LIZJ;
        return (effect == null || (requirements = effect.getRequirements()) == null) ? C13BV.INSTANCE : requirements;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final boolean LLJJI() {
        return LLLIZZ(SpeechEngineDefines.TTS_WORK_MODE_BOTH);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final boolean LLJZ() {
        return LLLIZZ(8388608);
    }

    @Override // com.bytedance.android.livesdkapi.depend.model.LiveEffect
    public final LiveEffect LLJZIJLIL() {
        C0UEP c0uep = new C0UEP();
        c0uep.LIZJ = this.LIZJ;
        c0uep.LJFF = this.LJFF;
        c0uep.LJI = this.LJI;
        c0uep.LJII = this.LJII;
        c0uep.LJIIIIZZ = this.LJIIIIZZ;
        c0uep.LJIIIZ = this.LJIIIZ;
        c0uep.LJIIJ = this.LJIIJ;
        c0uep.LJIIJJI = this.LJIIJJI;
        c0uep.LJIIL = this.LJIIL;
        c0uep.LJIILIIL = this.LJIILIIL;
        c0uep.LJIILJJIL = this.LJIILJJIL;
        c0uep.LJIILL = this.LJIILL;
        c0uep.LJIILLIIL = this.LJIILLIIL;
        c0uep.LJIIZILJ = this.LJIIZILJ;
        c0uep.LJIJ = this.LJIJ;
        c0uep.LJIJI = this.LJIJI;
        c0uep.LJIJJ = this.LJIJJ;
        c0uep.LJIJJLI = this.LJIJJLI;
        c0uep.LJIL = this.LJIL;
        c0uep.LJJ = this.LJJ;
        c0uep.LJJI = this.LJJI;
        c0uep.LJJIFFI = this.LJJIFFI;
        c0uep.LJJII = this.LJJII;
        c0uep.LJJIII = this.LJJIII;
        c0uep.LJJIIJ = this.LJJIIJ;
        c0uep.LJJIIJZLJL = this.LJJIIJZLJL;
        c0uep.LJJIIZ = this.LJJIIZ;
        c0uep.LJJIJIL = this.LJJIJIL;
        c0uep.LJJIJL = this.LJJIJL;
        c0uep.LJJIJLIJ = this.LJJIJLIJ;
        c0uep.LJJIJIIJIL = this.LJJIJIIJIL;
        c0uep.LJJIIZI = this.LJJIIZI;
        c0uep.LLJL(LJJLIIIJJI());
        c0uep.LJJIJ = this.LJJIJ;
        c0uep.LJJLJ(getPanel());
        return c0uep;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String Wp() {
        String gradeKey;
        Effect effect = this.LIZJ;
        return (effect == null || (gradeKey = effect.getGradeKey()) == null) ? "" : gradeKey;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String getDevicePlatform() {
        String devicePlatform;
        Effect effect = this.LIZJ;
        return (effect == null || (devicePlatform = effect.getDevicePlatform()) == null) ? "" : devicePlatform;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String getExtra() {
        Effect effect = this.LIZJ;
        if (effect != null) {
            return effect.getExtra();
        }
        return null;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String getFilePath() {
        String unzipPath;
        Effect effect = this.LIZJ;
        return (effect == null || (unzipPath = effect.getUnzipPath()) == null) ? "" : unzipPath;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final List<String> getMusic() {
        Effect effect = this.LIZJ;
        if (effect != null) {
            return effect.getMusic();
        }
        return null;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String getName() {
        String name;
        Effect effect = this.LIZJ;
        return (effect == null || (name = effect.getName()) == null) ? "" : name;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String getParent() {
        Effect effect = this.LIZJ;
        if (effect != null) {
            return effect.getParent();
        }
        return null;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String getResourceId() {
        String resourceId;
        Effect effect = this.LIZJ;
        return (effect == null || (resourceId = effect.getResourceId()) == null) ? "" : resourceId;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String getSchema() {
        String schema;
        Effect effect = this.LIZJ;
        return (effect == null || (schema = effect.getSchema()) == null) ? "" : schema;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final int getSource() {
        Effect effect = this.LIZJ;
        if (effect != null) {
            return effect.getSource();
        }
        return 0;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final List<String> getTags() {
        Effect effect = this.LIZJ;
        if (effect != null) {
            return effect.getTags();
        }
        return null;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final boolean LJIJJLI() {
        if (!LJJI()) {
            return LLLIZZ(16384);
        }
        String str = this.LJIILJJIL;
        return str != null && str.length() > 0 && new C0VSJ(getFilePath()).exists();
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final boolean LLFF() {
        return LLLIZZ(32768);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final UrlModel LLIIJLIL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getResourceId());
        sbLIZ.append("_hint");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Effect effect = this.LIZJ;
        return C0UCX.LIZIZ(strLIZIZ, effect != null ? effect.getHintFile() : null);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final UrlModel LLJILJILJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getResourceId());
        sbLIZ.append("_trans");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Effect effect = this.LIZJ;
        return C0UCX.LIZIZ(strLIZIZ, effect != null ? effect.getTrans_file_url() : null);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final UrlModel LLJJLIIIJLLLLLLLZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        Effect effect = this.LIZJ;
        sbLIZ.append(effect != null ? effect.getResourceId() : null);
        sbLIZ.append("_hint");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Effect effect2 = this.LIZJ;
        return C0UCX.LIZIZ(strLIZIZ, effect2 != null ? effect2.getHintIcon() : null);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String LLJLL() {
        return getResourceId();
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final UrlModel getFileUrl() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getResourceId());
        sbLIZ.append("_file");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Effect effect = this.LIZJ;
        return C0UCX.LIZIZ(strLIZIZ, effect != null ? effect.getFileUrl() : null);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final UrlModel getIcon() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        Effect effect = this.LIZJ;
        sbLIZ.append(effect != null ? effect.getResourceId() : null);
        sbLIZ.append("_icon");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Effect effect2 = this.LIZJ;
        return C0UCX.LIZIZ(strLIZIZ, effect2 != null ? effect2.getIcon_url() : null);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String getPanel() {
        String panel;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getPanel: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", ");
        Effect effect = this.LIZJ;
        sbLIZ.append(effect != null ? effect.getPanel() : null);
        C20441214yg.LIZIZ("EffectDebug", C2188811AlT.LIZIZ(sbLIZ));
        Effect effect2 = this.LIZJ;
        return (effect2 == null || (panel = effect2.getPanel()) == null) ? "" : panel;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String LJI() {
        return this.LJIJI;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final boolean LJIILJJIL() {
        return this.LJJIJ;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final int LJIILLIIL() {
        return this.LJJIFFI;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String LJJ() {
        return this.LJIILJJIL;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final long LJJIIZ() {
        return this.LJJII;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final List<String> LJJIJIIJIL() {
        return this.LJIIJ;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String LJJIJIL() {
        return this.LJIIIZ;
    }

    @Override // X.C0UEN, X.C0U7B
    public final Integer LJJIJL() {
        return this.LJJIJLIJ;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String LJJIL() {
        return this.LJIILIIL;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final int LJJJJ() {
        return this.LJJIJIIJIL;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final List<Integer> LJJJJJ() {
        return this.LJJIJIIJI;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final List<LiveEffect.ComposerConfig> LJJJZ() {
        return this.LJII;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String LJJLIIIJLLLLLLLZ() {
        return this.LJIILL;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final int LJJZZI() {
        return this.LJJIIZ;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String LJLIIL() {
        return this.LJJIIJ;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final C0U9E LJLIL() {
        return this.LJIJJLI;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final LiveEffect.StickerSDKExtra LJLJLLL() {
        return this.LJIIIIZZ;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String LJLL() {
        return this.LJIIL;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final C0U6H LJZI() {
        return this.LJIL;
    }

    @Override // X.C0UEN, X.C0U7B
    public final List<LiveEffect> LL() {
        return this.LJJIJL;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final boolean LLI() {
        return this.LJJIIZI;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final long LLIIL() {
        return this.LJJIII;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String LLILL() {
        return this.LJIIJJI;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String LLJJIJI() {
        return this.LJJIIJZLJL;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String LLJLLIL() {
        return this.LJIILLIIL;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final long getEffectId() {
        return this.LJFF;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final C767720U9q getLogParams() {
        return this.LJIJJ;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final Integer getPosition() {
        return this.LJIJ;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String getSearchId() {
        return this.LJJ;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final String getSessionId() {
        return this.LJIIZILJ;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LJFF(String str) {
        this.LJJ = str;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LJIIJJI(String str) {
        this.LJIIL = str;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LJIIL(String str) {
        this.LJIIIZ = str;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LJIILL(long j) {
        this.LJJIII = j;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LJIJJ(LiveEffect.StickerSDKExtra stickerSDKExtra) {
        this.LJIIIIZZ = stickerSDKExtra;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LJIL(boolean z) {
        LLLJ(131072, z);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LJJIFFI(String str) {
        this.LJJI = str;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LJJIIZI(boolean z) {
        this.LJJIJ = z;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LJJIZ(boolean z) {
        LLLJ(4, z);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LJJJIL(boolean z) {
        LLLJ(33554432, z);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LJJJJJL(boolean z) {
        this.LJJIIZI = z;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LJJJJL(String str) {
        this.LJIILJJIL = str;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LJJJJZ(boolean z) {
        LLLJ(262144, LJJI());
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LJJJLL(boolean z) {
        LLLJ(1, z);
    }

    @Override // X.C0UEN, X.C0U7B
    public final void LJJJLZIJ(Boolean bool) {
        boolean zBooleanValue;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        LLLJ(67108864, zBooleanValue);
    }

    @Override // X.C0UEN, X.C0U7B
    public final void LJJLI(Integer num) {
        this.LJJIJLIJ = num;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LJJLIIIJJIZ(int i) {
        this.LJJIIZ = i;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LJJLIIIJLJLI(boolean z) {
        LLLJ(2, z);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LJJLIL(boolean z) {
        LLLJ(16384, z);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LJJLJ(String str) {
        Effect effect;
        if (str != null && (effect = this.LIZJ) != null) {
            effect.setPanel(str);
        }
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LJJLJLI(String str) {
        this.LJIJI = str;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LJJLL(boolean z) {
        LLLJ(64, z);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LJJZ(boolean z) {
        LLLJ(128, z);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LJLI(String str) {
        this.LJIILIIL = str;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LJLILLLLZI(boolean z) {
        LLLJ(8192, z);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LJLJI(List<LiveEffect.ComposerConfig> list) {
        this.LJII = list;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LJLJJI(boolean z) {
        LLLJ(8388608, z);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LJLLI(C0U6H c0u6h) {
        this.LJIL = c0u6h;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LJZ(Integer num) {
        this.LJIJ = num;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LJZL(String str) {
        this.LJJIIJZLJL = str;
    }

    @Override // X.C0UEN, X.C0U7B
    public final void LLD(List<? extends LiveEffect> list) {
        this.LJJIJL = list;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LLF(String str) {
        this.LJIILL = str;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LLFII(boolean z) {
        LLLJ(16, z);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LLII(boolean z) {
        LLLJ(8, z);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LLIIII(boolean z) {
        LLLJ(32, z);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LLIIIL(boolean z) {
        LLLJ(SpeechEngineDefines.TTS_WORK_MODE_BOTH, z);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LLIIZ(long j) {
        this.LJFF = j;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LLIL(boolean z) {
        LLLJ(16777216, z);
    }

    @Override // X.C0UEN, X.C0U7B
    public final void LLILIL(LiveEffect liveEffect) {
        this.LJJIJIL = new WeakReference<>(liveEffect);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LLILLL(boolean z) {
        LLLJ(65536, z);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LLILZ(long j) {
        this.LJJII = j;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LLIZLLLIL(String str) {
        this.LJIIJ.add(str);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LLJ(boolean z) {
        LLLJ(1048576, z);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LLJIJIL(int i) {
        this.LJJIJIIJIL = i;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LLJILJIL(boolean z) {
        LLLJ(32768, z);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LLJJJJJIL(String str) {
        this.LJIILLIIL = str;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LLJL(boolean z) {
        LLLJ(134217728, z);
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LLJLIL(String str) {
        this.LJIIJJI = str;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LLJLILLLLZIIL(C0U9E c0u9e) {
        this.LJIJJLI = c0u9e;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void LLJLLL(String str) {
        this.LJJIIJ = str;
    }

    public final boolean LLLIZZ(int i) {
        if ((i & this.LJI) > 0) {
            return true;
        }
        return false;
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void setExtra(String str) {
        Effect effect = this.LIZJ;
        if (effect != null) {
            effect.setExtra(str);
        }
    }

    @Override // X.C0UEN, X.InterfaceC767600U9e
    public final void setSessionId(String str) {
        if (str == null) {
            str = "";
        }
        this.LJIIZILJ = str;
    }

    public final void LLLJ(int i, boolean z) {
        if (z) {
            this.LJI = i | this.LJI;
        } else {
            this.LJI = (~i) & this.LJI;
        }
    }
}
