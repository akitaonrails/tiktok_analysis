package X;

import androidx.lifecycle.LifecycleOwnerKt;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import mn3.e0;

/* JADX INFO: renamed from: X.0t9v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1654610t9v extends AbstractC2255721DQs<C0MFK> implements C0MFK, InterfaceC379610EuV {
    public static final C1654660tA0 LLIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final int LLJ;
    public final C1DRG LL;
    public final C0MFK LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), e0.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1647420syK.class, null);
    public final List<EnumC1654620t9w> LLILZIL = C1697810uHb.LJIIJJI(EnumC1654620t9w.AI_THEATER, EnumC1654620t9w.AI_ALIVE, EnumC1654620t9w.ANCHOR_LAYOUT, EnumC1654620t9w.ANCHOR_FILTER, EnumC1654620t9w.LAYOUT, EnumC1654620t9w.TEXT_MODE, EnumC1654620t9w.GREEN_SCREEN);
    public final ConcurrentHashMap<EnumC1654620t9w, InterfaceC1654640t9y> LLILZLL = new ConcurrentHashMap<>();

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0tA0] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1654610t9v.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1654610t9v.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0)};
        LLIZ = new Object() { // from class: X.0tA0
        };
        LLJ = 8;
    }

    private final e0 getCameraApiComponent() {
        return (e0) this.LLILLL.getValue(this, LLIZLLLIL[0]);
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLILZ.getValue(this, LLIZLLLIL[1]);
    }

    public final void H() {
        Iterator<EnumC1654620t9w> it2 = this.LLILZIL.iterator();
        while (it2.hasNext()) {
            InterfaceC1654640t9y interfaceC1654640t9y = this.LLILZLL.get(it2.next());
            if (interfaceC1654640t9y == null) {
                interfaceC1654640t9y = new InterfaceC1654640t9y() { // from class: X.0t9x
                    public static final EnumC1654620t9w LLILLJJLI = EnumC1654620t9w.NONE;

                    @Override // X.InterfaceC1654640t9y
                    public final void H() {
                    }

                    @Override // X.InterfaceC1654640t9y
                    public final boolean LJJLIL() {
                        return false;
                    }

                    @Override // X.InterfaceC1654640t9y
                    public final void z0() {
                    }

                    @Override // X.InterfaceC1654640t9y
                    public final EnumC1654620t9w LJJI() {
                        return LLILLJJLI;
                    }
                };
            }
            C201967140v c201967140v = C201967140v.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("check ");
            sbLIZ.append(interfaceC1654640t9y.LJJI());
            C201955140j.LIZLLL(c201967140v, "RecordTooltipLogicComponent", C2188811AlT.LIZIZ(sbLIZ));
            if (interfaceC1654640t9y.LJJLIL()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("show ");
                sbLIZ2.append(interfaceC1654640t9y.LJJI());
                C201955140j.LIZLLL(c201967140v, "RecordTooltipLogicComponent", C2188811AlT.LIZIZ(sbLIZ2));
                interfaceC1654640t9y.H();
                interfaceC1654640t9y.z0();
                return;
            }
        }
    }

    public final InterfaceC1651080t4E getToolbarApi() {
        C385670FAf<InterfaceC1651080t4E> c385670FAfI42;
        InterfaceC1647420syK recordAdapterApi = getRecordAdapterApi();
        if (recordAdapterApi == null || (c385670FAfI42 = recordAdapterApi.I42()) == null) {
            return null;
        }
        return c385670FAfI42.LIZJ();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        final C013C c013c = new C013C();
        getCameraApiComponent().A31().LIZ(this, new InterfaceC1441305kZ() { // from class: X.0NQX
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    C013C c013c2 = c013c;
                    if (!c013c2.element) {
                        c013c2.element = true;
                        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C0NQW(this, null), 3);
                    }
                }
            }
        });
    }

    public C0MFK W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1654610t9v(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.C0MFK
    public void ig(InterfaceC1654640t9y interfaceC1654640t9y) {
        C201967140v c201967140v = C201967140v.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register ");
        sbLIZ.append(interfaceC1654640t9y.LJJI());
        C201955140j.LIZLLL(c201967140v, "RecordTooltipLogicComponent", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZLL.put(interfaceC1654640t9y.LJJI(), interfaceC1654640t9y);
    }
}
