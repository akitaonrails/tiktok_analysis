package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14LI, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C14LI implements InterfaceC20153913tR<Unit> {
    public final String LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(343));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(342));

    public abstract CreativeModel LIZ();

    public abstract Float LIZIZ();

    public abstract String LIZJ();

    public abstract MusicBuzModel LIZLLL();

    public abstract NLEModel LJFF();

    public abstract String LJI();

    public abstract String LJII();

    public abstract boolean LJIIIIZZ();

    @Override // X.InterfaceC20153913tR
    public abstract String getId();

    public final String LJ() {
        String str;
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        NLETrack next;
        NLETrackSlot nLETrackSlot;
        NLESegment mainSegment;
        NLEResourceNode resource;
        MusicBuzModel musicBuzModelLIZLLL = LIZLLL();
        if (musicBuzModelLIZLLL == null || (str = musicBuzModelLIZLLL.path) == null) {
            return null;
        }
        try {
            c098200Yq = Boolean.valueOf(new C0VSJ(str).exists());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = Boolean.FALSE;
        }
        if (((Boolean) c098200Yq).booleanValue()) {
            return str;
        }
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(musicBuzModelLIZLLL);
        if (aVMusicExtractAVMusic != null) {
            try {
                c098200Yq2 = ((IAnotherMusicService) this.LIZJ.getValue()).LJI(aVMusicExtractAVMusic);
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = null;
            }
            String str2 = (String) c098200Yq2;
            if (str2 != null) {
                try {
                    c098200Yq3 = Boolean.valueOf(new C0VSJ(str2).exists());
                    C189200o6.m2constructorimpl(c098200Yq3);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    c098200Yq3 = new C098200Yq(th3);
                    C189200o6.m2constructorimpl(c098200Yq3);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq3) != null) {
                    c098200Yq3 = Boolean.FALSE;
                }
                if (((Boolean) c098200Yq3).booleanValue()) {
                    return str2;
                }
            }
        }
        NLEModel nLEModelLJFF = LJFF();
        if (nLEModelLJFF == null) {
            return null;
        }
        Iterator<NLETrack> it2 = nLEModelLJFF.getTracks().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (Intrinsics.LJFF(next.getExtra("AudioTrackType"), "BGM")) {
                break;
            }
        }
        NLETrack nLETrack = next;
        if (nLETrack == null || (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(nLETrack.getSlots())) == null || (mainSegment = nLETrackSlot.getMainSegment()) == null || (resource = mainSegment.getResource()) == null) {
            return null;
        }
        return resource.getResourceFile();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0231  */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    @Override // X.InterfaceC20153913tR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit execute() {
        /*
            Method dump skipped, instruction units count: 958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14LI.execute():kotlin.Unit");
    }

    public C14LI(String str) {
        this.LIZ = str;
    }
}
