package X;

import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.SMBLivePreview;
import com.ss.android.ugc.aweme.feed.model.live.WatchReasonItem;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1ACA, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ACA {
    public Aweme LIZ;
    public Aweme LIZIZ;
    public LiveRoomStruct LIZJ;
    public String LIZLLL;
    public final String LJ;
    public boolean LJFF;
    public EnumC1154970gA3 LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public final C2175861ADo LJIIIZ;
    public final C1ADO LJIIJ;
    public final C2175121AAs LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public Set<String> LJIILJJIL;
    public String LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public Float LJIJ;
    public Float LJIJI;
    public final List<String> LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public final int LJJ;
    public boolean LJJI;
    public boolean LJJIFFI;
    public boolean LJJII;
    public SlimRoom.LinkMic LJJIII;
    public boolean LJJIIJ;
    public int LJJIIJZLJL;
    public IMessageManager LJJIIZ;
    public C1ABU LJJIIZI;
    public int LJJIJ;
    public long LJJIJIIJI;
    public final CopyOnWriteArrayList<Float> LJJIJIIJIL;
    public final CopyOnWriteArrayList<Float> LJJIJIL;
    public final CopyOnWriteArrayList<Long> LJJIJL;
    public final CopyOnWriteArrayList<Double> LJJIJLIJ;
    public final CopyOnWriteArrayList<Double> LJJIL;
    public final CopyOnWriteArrayList<Float> LJJIZ;
    public long LJJJ;
    public long LJJJI;
    public String LJJJIL;
    public String LJJJJ;
    public String LJJJJI;
    public boolean LJJJJIZL;
    public boolean LJJJJJ;
    public boolean LJJJJJL;
    public boolean LJJJJL;
    public boolean LJJJJLI;
    public InterfaceC2175971ADz LJJJJLL;
    public boolean LJJJJZ;
    public String LJJJJZI;
    public InterfaceC2175871ADp LJJJLIIL;
    public boolean LJJJLL;
    public boolean LJJJLZIJ;
    public final C2175771ADf LJJJZ;
    public long LJJL;
    public String LJJLI;
    public Boolean LJJLIIIIJ;
    public String LJJLIIIJ;
    public JSONObject LJJLIIIJILLIZJL;
    public boolean LJJLIIIJJI;
    public Pair<Long, Boolean> LJJLIIIJJIZ;
    public int LJJLIIIJL;
    public String LJJLIIIJLJLI;
    public int LJJLIIIJLLLLLLLZ;
    public String LJJLIIJ;
    public C1ACV LJJLIL;
    public WeakReference<InterfaceC483300IxM> LJJLJ;
    public EnumC745120TKs LJJLJLI;
    public boolean LJJLL;
    public boolean LJJZ;
    public boolean LJJZZI;
    public int LJJZZIII;
    public boolean LJL;
    public boolean LJLI;
    public String LJLIIIL;
    public boolean LJLIIL;
    public SMBLivePreview.PreviewItem LJLIL;
    public C1A7N LJLILLLLZI;
    public long LJLJI;
    public long LJLJJI;
    public int LJLJJL;
    public String LJLJJLL;
    public final Set<EnumC999300c6y> LJLJL;
    public String LJLJLJ;
    public String LJLJLLL;
    public String LJLL;
    public int LJLLI;
    public long LJLLILLLL;
    public long LJLLJ;
    public long LJLLL;
    public int LJLLLL;
    public String LJLLLLLL;
    public WatchReasonItem LJLZ;
    public WatchReasonItem LJZ;
    public String LJZI;
    public String LJZL;
    public boolean LL;
    public int LLD;
    public int LLF;
    public boolean LLFF;
    public boolean LLFFF;
    public boolean LLFII;

    public C1ACA() {
        this(null, null, null, null, 0, -1);
    }

    public C1ACA(Aweme aweme, Aweme aweme2, LiveRoomStruct liveRoomStruct, String str, int i, int i2) {
        String str2;
        boolean z;
        EnumC1154970gA3 enumC1154970gA3;
        C2175861ADo c2175861ADo;
        C1ADO c1ado;
        C2175121AAs c2175121AAs;
        ArrayList arrayList;
        boolean z2;
        boolean z3;
        int i3;
        boolean z4;
        int i4;
        int i5 = i;
        LiveRoomStruct liveRoomStruct2 = liveRoomStruct;
        Aweme aweme3 = aweme2;
        Aweme aweme4 = (i2 & 1) != 0 ? null : aweme;
        aweme3 = (i2 & 2) != 0 ? null : aweme3;
        liveRoomStruct2 = (i2 & 4) != 0 ? null : liveRoomStruct2;
        if ((i2 & 8) != 0) {
            str2 = "homepage_hot";
        } else {
            str2 = null;
        }
        String str3 = (i2 & 16) == 0 ? str : "homepage_hot";
        if ((i2 & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i2 & 64) != 0) {
            enumC1154970gA3 = EnumC1154970gA3.CHECK_ALIVE_STATE_NONE;
        } else {
            enumC1154970gA3 = null;
        }
        i5 = (i2 & 256) != 0 ? -1 : i5;
        if ((i2 & 512) != 0) {
            c2175861ADo = new C2175861ADo();
        } else {
            c2175861ADo = null;
        }
        if ((i2 & 1024) != 0) {
            c1ado = new C1ADO();
        } else {
            c1ado = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c2175121AAs = new C2175121AAs();
        } else {
            c2175121AAs = null;
        }
        if ((1048576 & i2) != 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = null;
        }
        if ((2097152 & i2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((4194304 & i2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if ((8388608 & i2) != 0) {
            i3 = -1;
        } else {
            i3 = 0;
        }
        if ((268435456 & i2) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if ((i2 & 536870912) != 0) {
            i4 = 2;
        } else {
            i4 = 0;
        }
        CopyOnWriteArrayList<Float> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        CopyOnWriteArrayList<Float> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
        CopyOnWriteArrayList<Long> copyOnWriteArrayList3 = new CopyOnWriteArrayList<>();
        CopyOnWriteArrayList<Double> copyOnWriteArrayList4 = new CopyOnWriteArrayList<>();
        CopyOnWriteArrayList<Double> copyOnWriteArrayList5 = new CopyOnWriteArrayList<>();
        CopyOnWriteArrayList<Float> copyOnWriteArrayList6 = new CopyOnWriteArrayList<>();
        C2175771ADf c2175771ADf = new C2175771ADf();
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.LIZ = aweme4;
        this.LIZIZ = aweme3;
        this.LIZJ = liveRoomStruct2;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = z;
        this.LJI = enumC1154970gA3;
        this.LJII = false;
        this.LJIIIIZZ = i5;
        this.LJIIIZ = c2175861ADo;
        this.LJIIJ = c1ado;
        this.LJIIJJI = c2175121AAs;
        this.LJIIL = false;
        this.LJIILIIL = false;
        this.LJIILJJIL = null;
        this.LJIILL = null;
        this.LJIILLIIL = false;
        this.LJIIZILJ = false;
        this.LJIJ = null;
        this.LJIJI = null;
        this.LJIJJ = arrayList;
        this.LJIJJLI = z2;
        this.LJIL = z3;
        this.LJJ = i3;
        this.LJJI = false;
        this.LJJIFFI = false;
        this.LJJII = false;
        this.LJJIII = null;
        this.LJJIIJ = z4;
        this.LJJIIJZLJL = i4;
        this.LJJIIZ = null;
        this.LJJIIZI = null;
        this.LJJIJ = 0;
        this.LJJIJIIJI = 0L;
        this.LJJIJIIJIL = copyOnWriteArrayList;
        this.LJJIJIL = copyOnWriteArrayList2;
        this.LJJIJL = copyOnWriteArrayList3;
        this.LJJIJLIJ = copyOnWriteArrayList4;
        this.LJJIL = copyOnWriteArrayList5;
        this.LJJIZ = copyOnWriteArrayList6;
        this.LJJJ = 0L;
        this.LJJJI = 0L;
        this.LJJJIL = null;
        this.LJJJJ = "";
        this.LJJJJI = null;
        this.LJJJJIZL = false;
        this.LJJJJJ = false;
        this.LJJJJJL = false;
        this.LJJJJL = false;
        this.LJJJJLI = false;
        this.LJJJJLL = null;
        this.LJJJJZ = false;
        this.LJJJJZI = "";
        this.LJJJLIIL = null;
        this.LJJJLL = false;
        this.LJJJLZIJ = false;
        this.LJJJZ = c2175771ADf;
        this.LJJL = 0L;
        this.LJJLI = null;
        this.LJJLIIIIJ = null;
        this.LJJLIIIJ = null;
        this.LJJLIIIJILLIZJL = null;
        this.LJJLIIIJJI = false;
        this.LJJLIIIJJIZ = null;
        this.LJJLIIIJL = 0;
        this.LJJLIIIJLJLI = "";
        this.LJJLIIIJLLLLLLLZ = 0;
        this.LJJLIIJ = "";
        this.LJJLIL = null;
        this.LJJLJ = null;
        this.LJJLJLI = null;
        this.LJJLL = false;
        this.LJJZ = false;
        this.LJJZZI = false;
        this.LJJZZIII = 0;
        this.LJL = false;
        this.LJLI = false;
        this.LJLIIIL = null;
        this.LJLIIL = false;
        this.LJLIL = null;
        this.LJLILLLLZI = null;
        this.LJLJI = -1L;
        this.LJLJJI = -1L;
        this.LJLJJL = -1;
        this.LJLJJLL = "none";
        this.LJLJL = copyOnWriteArraySet;
        this.LJLJLJ = null;
        this.LJLJLLL = null;
        this.LJLL = null;
        this.LJLLI = 0;
        this.LJLLILLLL = 0L;
        this.LJLLJ = 0L;
        this.LJLLL = 0L;
        this.LJLLLL = -1;
        this.LJLLLLLL = null;
        this.LJLZ = null;
        this.LJZ = null;
        this.LJZI = null;
        this.LJZL = null;
        this.LL = false;
        this.LLD = 0;
        this.LLF = 0;
        this.LLFF = false;
    }
}
