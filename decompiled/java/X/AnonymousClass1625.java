package X;

import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PlayAddress;
import com.ss.android.ugc.aweme.feed.model.TtsInfos;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.text.u;

/* JADX INFO: renamed from: X.1625, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1625 extends C162R<C0SA3> {
    public static final AnonymousClass1625 LJ = new AnonymousClass1625();
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(21));

    @Override // X.C163A
    public final String LJFF() {
        return "DubbingTranslationRepo";
    }

    @Override // X.C163A
    public final AbstractC1361510lXB LIZJ() {
        return (AbstractC1361510lXB) LJFF.getValue();
    }

    @Override // X.C163A
    public final EnumC207100162g LIZLLL(Aweme aweme) {
        return EnumC207100162g.DUBBING;
    }

    @Override // X.C163A
    public final String LJ(Aweme aweme) {
        String strLJIIIZ = C20703515zt.LJIIIZ(aweme);
        if (strLJIIIZ == null) {
            return "";
        }
        return strLJIIIZ;
    }

    @Override // X.C163A
    public final C11NZ LJIILJJIL(Aweme aweme, C162U c162u, String str, InterfaceC1389740mGi interfaceC1389740mGi, String str2) {
        List<TtsInfos> ttsInfos;
        TtsInfos next;
        boolean z;
        List<String> list;
        Aweme aweme2 = aweme;
        EnumC207100162g enumC207100162g = EnumC207100162g.DUBBING;
        Audio audio = aweme2.getAudio();
        String str3 = null;
        if (audio != null && (ttsInfos = audio.getTtsInfos()) != null && str.length() != 0) {
            Iterator<TtsInfos> it2 = ttsInfos.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    String str4 = next.languageCode;
                    if (str4 != null && u.LJIJI(str4, str, true)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            TtsInfos ttsInfos2 = next;
            if (ttsInfos2 != null) {
                PlayAddress playAddress = ttsInfos2.playAddress;
                if (playAddress != null && (list = playAddress.urlList) != null) {
                    str3 = (String) C13LP.LJJJLL(list);
                }
                String str5 = ttsInfos2.voiceType;
                Long l = ttsInfos2.languageId;
                if (interfaceC1389740mGi != null) {
                    z = true;
                } else {
                    z = false;
                }
                ((AbstractC1361510lXB) LJFF.getValue()).LJFF(new C0SA3(l, str, str3, str5, z), aweme2, str);
                C163A.LJIILIIL(this, enumC207100162g, c162u, null, false, interfaceC1389740mGi, null, null, null, null, 984);
                return C11NZ.LJJJJZ(Boolean.TRUE);
            }
        }
        C163W c163w = C163W.CLIENT_ERROR;
        getClass();
        C163A.LJIIJJI(enumC207100162g, c162u, "DUBBING_NO_TTS_FOR_LANG", c163w, interfaceC1389740mGi, null, null, null, null);
        return C11NZ.LJJJJZ(Boolean.FALSE);
    }
}
