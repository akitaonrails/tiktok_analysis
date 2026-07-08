package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import webcast.data.MusicSong;

/* JADX INFO: renamed from: X.0UDj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C768690UDj {
    public final InterfaceC768710UDl LIZ;
    public final Set<MusicSong> LIZIZ = new LinkedHashSet();
    public final C784860Uqa LIZJ;
    public final AwS591S0100000_12 LIZLLL;

    public C768690UDj(C762190Tv7 c762190Tv7) {
        this.LIZ = c762190Tv7;
        C784860Uqa c784860UqaLIZIZ = InterfaceC766480U4w.LJIILLIIL.LIZIZ();
        this.LIZJ = c784860UqaLIZIZ;
        Iterator<Map.Entry<Long, String>> it2 = c784860UqaLIZIZ.entrySet().iterator();
        while (it2.hasNext()) {
            if (!new C0VSJ(it2.next().getValue()).exists()) {
                it2.remove();
            }
        }
        InterfaceC766480U4w.LJIILLIIL.LJFF(this.LIZJ);
        this.LIZLLL = new AwS591S0100000_12(this, 831);
    }

    public static C207209166l LIZIZ(MusicSong musicSong) {
        Long lValueOf;
        String str;
        EnumC771350UNp enumC771350UNp = EnumC771350UNp.MUSIC_BGM;
        if (musicSong != null) {
            lValueOf = Long.valueOf(musicSong.id);
        } else {
            lValueOf = null;
        }
        String strValueOf = String.valueOf(lValueOf);
        if (musicSong == null || (str = musicSong.previewUrl) == null) {
            str = "";
        }
        return new C207209166l(strValueOf, enumC771350UNp, null, null, str, null, true, 0, false, 876);
    }

    public final void LIZ(final MusicSong musicSong) {
        if (musicSong == null) {
            return;
        }
        String str = (String) this.LIZJ.get((Object) Long.valueOf(musicSong.id));
        if (str != null && new C0VSJ(str).exists()) {
            this.LIZ.LIZ(musicSong, this.LIZLLL);
            return;
        }
        Set<MusicSong> set = this.LIZIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(set, 10));
        Iterator<MusicSong> it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().id));
        }
        if (arrayList.contains(Long.valueOf(musicSong.id))) {
            this.LIZ.LIZJ(musicSong);
            return;
        }
        final C207209166l c207209166lLIZIZ = LIZIZ(musicSong);
        if (c207209166lLIZIZ.LJIIIZ.length() == 0) {
            C766270U4b.LIZLLL(2131844638);
            this.LIZ.LIZIZ(musicSong);
        }
        C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0UDk
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<Unit> c09aj) {
                C1C7U.LIZ("BGMDownloader@f641.startDownload$1");
                C207232167i.LIZIZ(c207209166lLIZIZ, new AwS378S0200000_12(musicSong, this, 64));
                C1C7U.LIZIZ("BGMDownloader@f641.startDownload$1");
            }
        }).LJL(C11S5.LIZ()).LIZIZ(new C476750Imn());
    }
}
