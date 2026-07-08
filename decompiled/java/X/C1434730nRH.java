package X;

import com.bytedance.crash.Npth;
import com.bytedance.keva.Keva;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CommonMobParamModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.edit.TTStoryUploadModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.port.internal.IInternalDraftSizeCalculator;
import com.ss.android.ugc.aweme.port.internal.IPublishGuideDraftService;
import com.ss.android.ugc.aweme.port.internal.draft.IDraftOrganizerPostTracker;
import com.ss.android.ugc.aweme.publish.core.publisher.IPublishServiceFactory;
import com.ss.android.ugc.aweme.service.IToolsVQEvaluationService;
import com.ss.android.ugc.aweme.services.publish.IAVPublishWhiteBoxService;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.PublishServiceFactoryImpl;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.experiment.PublishPatienceConfig;
import com.ss.android.ugc.aweme.shortvideo.monitor.music.MusicMonitorTaskQueueService;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.ui.publishprogress.PublishProgressDialogAddHelper;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.aweme.wavepublish.experiment.EnableParallelPublishSchedulerV2Exp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS129S0400000_35;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS636S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import lth.o;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0nRH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1434730nRH extends AbstractC1434920nRa {
    public final C1433530nPL LIZJ;
    public final String LIZLLL;
    public final C1430790nKv LJ;
    public final InterfaceC1434300nQa LJFF;
    public volatile C1D80 LJI;
    public final C01GW LJII;
    public AbstractC1433570nPP LJIIIIZZ;
    public final C1434960nRe LJIIIZ;
    public final C1434970nRf LJIIJ;
    public volatile boolean LJIIJJI;
    public volatile boolean LJIIL;
    public C1433340nP2 LJIILIIL;
    public C2280661EOq LJIILJJIL;
    public final PublishPatienceConfig LJIILL;
    public final C01GW LJIILLIIL;
    public final C01GW LJIIZILJ;
    public final C01GW LJIJ;
    public final C01GW LJIJI;
    public Pair<Integer, C1434900nRY> LJIJJ;

    @Override // X.AbstractC1434920nRa, X.InterfaceC1433580nPQ
    public final boolean LJIILLIIL() {
        if (this.LIZJ.LIZ.publishType == 1) {
            return this.LJIIJJI;
        }
        int i = this.LIZJ.LIZ.publishType;
        return i != 1 ? i == 2 && this.LJIIJJI && this.LJIIL : this.LJIIJJI;
    }

    @Override // X.InterfaceC1433580nPQ
    public final void reStart() {
        C1D80 c1d80 = this.LJI;
        if (c1d80 == null) {
            c1d80 = null;
        }
        if (c1d80.LIZJ() instanceof C1D8S) {
            LIZJ(null);
        }
        LJ(null);
    }

    @Override // X.InterfaceC1433580nPQ
    public final boolean LJIJ() {
        return this.LJIIJJI;
    }

    public static boolean LIZLLL(VideoPublishEditModel videoPublishEditModel) {
        if (!C1447250nlT.LIZLLL()) {
            if (C1447250nlT.LIZ() && !C1428470nHB.LJJZZI(videoPublishEditModel)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03a1  */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1D82[] LIZ(X.C1434520nQw r30) {
        /*
            Method dump skipped, instruction units count: 1903
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1434730nRH.LIZ(X.0nQw):X.1D82[]");
    }

    public final void LIZJ(C1434520nQw c1434520nQw) {
        C1931707hT c1931707hT;
        C1434550nQz c1434550nQz;
        boolean z;
        InterfaceC1840230xzJ c1435900nTA;
        String parallelUploadOutputFile;
        C1D82[] c1d82ArrLIZ = LIZ(c1434520nQw);
        C1D82[] c1d82Arr = (C1D82[]) Arrays.copyOf(c1d82ArrLIZ, c1d82ArrLIZ.length);
        C1D82[] c1d82Arr2 = (C1D82[]) Arrays.copyOf(c1d82Arr, c1d82Arr.length);
        C1440550naf c1440550naf = new C1440550naf("DefaultWavePublisher", (C1D82[]) Arrays.copyOf(c1d82Arr2, c1d82Arr2.length));
        c1440550naf.LIZIZ = this.LIZJ.LIZIZ;
        c1440550naf.LIZJ = true;
        ArrayList arrayList = (ArrayList) c1440550naf.LIZLLL;
        arrayList.add(this.LJIIJ);
        arrayList.add(this.LJIIIZ);
        arrayList.add(this.LJII.getValue());
        arrayList.add(new C1404570med(this.LIZJ.LIZIZ));
        if (!C1428470nHB.LJJZZI(this.LJIIIZ.LIZ)) {
            if (C297810Blr.LIZ()) {
                parallelUploadOutputFile = this.LJIIIZ.LIZ.getOutputFile();
            } else {
                parallelUploadOutputFile = this.LJIIIZ.LIZ.getParallelUploadOutputFile();
            }
            arrayList.add(new C2221281Bwk(parallelUploadOutputFile, this.LIZLLL));
        }
        arrayList.add(new InterfaceC1434170nQN() { // from class: X.0nRQ
            @Override // X.InterfaceC1434170nQN
            public final void LIZIZ() {
                C1434730nRH c1434730nRH = this.LIZ;
                C1433340nP2 c1433340nP2 = c1434730nRH.LJIILIIL;
                if (c1433340nP2 != null) {
                    C1433730nPf.LJJ(c1434730nRH.LIZJ.LIZIZ, c1433340nP2);
                }
                C1434730nRH c1434730nRH2 = this.LIZ;
                C2280661EOq c2280661EOq = c1434730nRH2.LJIILJJIL;
                if (c2280661EOq != null) {
                    c2280661EOq.LJI = false;
                }
                C1D80 c1d80 = c1434730nRH2.LJI;
                if (c1d80 == null) {
                    c1d80 = null;
                }
                C1433700nPc c1433700nPc = new C1433700nPc();
                c1433700nPc.LIZ = "cancel_by_hw_fallback";
                c1d80.LIZIZ(c1433700nPc.LIZ());
            }

            @Override // X.InterfaceC1434170nQN
            public final void LIZ(C1434520nQw c1434520nQw2) {
                C1434730nRH c1434730nRH = this.LIZ;
                if (c1434730nRH.LIZJ.LJI == null) {
                    return;
                }
                C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("restarting wave publisher, previous state: ");
                C1D80 c1d80 = c1434730nRH.LJI;
                if (c1d80 == null) {
                    c1d80 = null;
                }
                sbLIZ.append(c1d80.LIZJ());
                sbLIZ.append(", session info: ");
                sbLIZ.append(c1434520nQw2);
                c1437510nVlLJJLIIIJ.LIZ("publish_flow_optimization", C2188811AlT.LIZIZ(sbLIZ));
                c1434730nRH.LIZJ(c1434520nQw2);
                c1434730nRH.LJ(EnumC1405170mfb.RETRY_BY_PUBLISHER);
            }
        });
        if (c1434520nQw == null || (c1931707hT = c1434520nQw.LIZ) == null) {
            C1931607hS.LIZ.getClass();
            c1931707hT = new C1931707hT(0);
        }
        arrayList.add(c1931707hT);
        if (c1434520nQw == null || (c1434550nQz = c1434520nQw.LIZIZ) == null) {
            c1434550nQz = new C1434550nQz(0);
        }
        arrayList.add(c1434550nQz);
        arrayList.add(C1439900nZc.LIZ(this.LJIIIZ.LIZ));
        arrayList.add(this.LJ);
        arrayList.add(this.LJFF);
        arrayList.add(this.LJIJI.getValue());
        arrayList.add(this.LJIJ.getValue());
        arrayList.add(this.LJIIZILJ.getValue());
        c1440550naf.LJFF = EnableParallelPublishSchedulerV2Exp.LIZ().enable;
        c1440550naf.LJ = C1435270nS9.LIZ();
        this.LJFF.LJFF();
        c1440550naf.LJII = new C1435280nSA(C1434840nRS.LIZLLL(this.LIZJ));
        this.LJFF.LJFF();
        c1440550naf.LJIIIIZZ = new C1435280nSA(C1434840nRS.LJ());
        this.LJFF.LJFF();
        c1440550naf.LJIIIZ = new C1435280nSA(C1434840nRS.LIZJ());
        this.LJI = c1440550naf.LIZ();
        this.LJFF.LIZJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WavePublish | net:");
        C1D80 c1d80 = this.LJI;
        C1D80 c1d802 = null;
        if (c1d80 == null) {
            c1d80 = null;
        }
        sbLIZ.append(c1d80.hashCode());
        sbLIZ.append(", tag: ");
        C1D80 c1d803 = this.LJI;
        if (c1d803 == null) {
            c1d803 = null;
        }
        sbLIZ.append(c1d803.LJIIJ);
        sbLIZ.append(", net init finish");
        C1405310mfp.LIZIZ("init_wave", C2188811AlT.LIZIZ(sbLIZ));
        if (((Boolean) C262750ARl.LIZ.getValue()).booleanValue()) {
            C201955140j.LJIILIIL("DefaultWavePublisher", "disable publish network monitor is open then addObserver");
            C1D80 c1d804 = this.LJI;
            if (c1d804 == null) {
                c1d804 = null;
            }
            c1d804.LIZ(new C1445820njA());
        }
        C1D80 c1d805 = this.LJI;
        if (c1d805 == null) {
            c1d805 = null;
        }
        c1d805.LIZ(new C1404420meO());
        if (C0M21.LIZIZ() != null) {
            C1D80 c1d806 = this.LJI;
            if (c1d806 == null) {
                c1d806 = null;
            }
            C1D80 c1d807 = this.LJI;
            if (c1d807 == null) {
                c1d807 = null;
            }
            final String str = c1d807.LJIIJ;
            final String creationId = this.LJIIIZ.LIZ.getCreationId();
            c1d806.LIZ(new AbstractC1446660nkW(str, creationId) { // from class: X.0meZ
                public final String LJ;
                public volatile boolean LJFF;

                @Override // X.AbstractC1446660nkW
                public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
                }

                @Override // X.AbstractC1446660nkW
                public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) {
                }

                @Override // X.AbstractC1446660nkW
                public final void LJFF(Object obj, Object obj2, boolean z2, int i, int i2) {
                }

                {
                    List listSingletonList = Collections.singletonList(EnumC1434770nRL.COMPILE);
                    this.LJ = creationId;
                }

                @Override // X.AbstractC1446660nkW
                public final void LJ(Object obj, C1404610meh c1404610meh) {
                    if (this.LJFF) {
                        return;
                    }
                    this.LJFF = true;
                    IDraftOrganizerPostTracker iDraftOrganizerPostTracker = (IDraftOrganizerPostTracker) PluggableExtentionKt.pluggableSpi$default(IDraftOrganizerPostTracker.class, false, false, false, 14, null);
                    if (iDraftOrganizerPostTracker != null) {
                        iDraftOrganizerPostTracker.LIZLLL(this.LJ);
                    }
                }
            });
        }
        C1433530nPL c1433530nPL = this.LIZJ;
        AbstractC1433570nPP abstractC1433570nPP = this.LJIIIIZZ;
        if (abstractC1433570nPP == null) {
            abstractC1433570nPP = null;
        }
        final C1434660nRA c1434660nRA = new C1434660nRA(c1433530nPL, abstractC1433570nPP);
        C1D80 c1d808 = this.LJI;
        if (c1d808 == null) {
            c1d808 = null;
        }
        String str2 = c1d808.LJIIJ;
        C1D80 c1d809 = this.LJI;
        if (c1d809 == null) {
            c1d809 = null;
        }
        final String str3 = c1d809.LJIIJ;
        final C1433530nPL c1433530nPL2 = this.LIZJ;
        AbstractC1446660nkW abstractC1446660nkW = new AbstractC1446660nkW(str3, c1434660nRA, c1433530nPL2) { // from class: X.0nR6
            public final C1434660nRA LJ;
            public final C1433530nPL LJFF;
            public C1405220mfg LJI;
            public C1404570med LJII;
            public C1434970nRf LJIIIIZZ;

            @Override // X.AbstractC1446660nkW
            public final void LIZLLL(Object obj, C556300Lro c556300Lro, AbstractC556190Lrd abstractC556190Lrd) {
            }

            @Override // X.AbstractC1446660nkW
            public final void LJ(Object obj, C1404610meh c1404610meh) {
                Iterator<Object> it2 = c1404610meh.LIZ.iterator();
                while (true) {
                    C1404570med c1404570med = null;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (next instanceof C1405220mfg) {
                        if (next != null) {
                            this.LJI = (C1405220mfg) next;
                            Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                Object next2 = it3.next();
                                if (next2 instanceof C1404570med) {
                                    if (next2 != null) {
                                        this.LJII = (C1404570med) next2;
                                        Iterator<Object> it4 = c1404610meh.LIZ.iterator();
                                        while (true) {
                                            if (!it4.hasNext()) {
                                                break;
                                            }
                                            Object next3 = it4.next();
                                            if (next3 instanceof C1434970nRf) {
                                                if (next3 != null) {
                                                    C1434970nRf c1434970nRf = (C1434970nRf) next3;
                                                    this.LJIIIIZZ = c1434970nRf;
                                                    PublishModel publishModel = c1434970nRf.LIZ;
                                                    C1404570med c1404570med2 = this.LJII;
                                                    if (c1404570med2 != null) {
                                                        c1404570med = c1404570med2;
                                                    }
                                                    publishModel.publishId = c1404570med.LIZ;
                                                    return;
                                                }
                                            }
                                        }
                                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
                                    }
                                }
                            }
                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishId");
                        }
                    }
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.normal.ClickPublishWaiter");
            }

            {
                this.LJ = c1434660nRA;
                this.LJFF = c1433530nPL2;
            }

            @Override // X.AbstractC1446660nkW
            public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
                C1434660nRA c1434660nRA2 = this.LJ;
                C1431740nMS c1431740nMS = C1431740nMS.INSTANCE;
                C1434970nRf c1434970nRf = this.LJIIIIZZ;
                if (c1434970nRf == null) {
                    c1434970nRf = null;
                }
                c1434660nRA2.LIZIZ(c1431740nMS, c1434970nRf.LIZ);
            }

            @Override // X.AbstractC1446660nkW
            public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) {
                this.LJFF.LJII = Integer.valueOf(c1435220nS4.getCode());
                C1405220mfg c1405220mfg = this.LJI;
                C1434970nRf c1434970nRf = null;
                if (c1405220mfg == null) {
                    c1405220mfg = null;
                }
                if (c1405220mfg.LIZIZ) {
                    Throwable t = c1435220nS4.getT();
                    C1434340nQe c1434340nQe = C1434330nQd.Companion;
                    int code = c1435220nS4.getCode();
                    c1434340nQe.getClass();
                    C1434650nR9 c1434650nR9 = new C1434650nR9(t, C1434340nQe.LIZ(code), c1435220nS4.getCode(), c1435220nS4.getNodeTag().toString());
                    c1434650nR9.setPublishDuration(i);
                    c1434650nR9.setErrorCode(c1435220nS4.getCode());
                    c1434650nR9.setServerLogId(C1431420nLw.LJ(c1435220nS4));
                    c1434650nR9.setFailedTaskTag(obj);
                    c1434650nR9.setOriginErrorCode(c1435220nS4.getCode());
                    C1434660nRA c1434660nRA2 = this.LJ;
                    C1434970nRf c1434970nRf2 = this.LJIIIIZZ;
                    if (c1434970nRf2 != null) {
                        c1434970nRf = c1434970nRf2;
                    }
                    c1434660nRA2.LIZIZ(c1434650nR9, c1434970nRf.LIZ);
                }
            }

            @Override // X.AbstractC1446660nkW
            public final void LJFF(Object obj, Object obj2, boolean z2, int i, int i2) {
                Iterator<Object> it2 = ((C1404610meh) obj2).LIZ.iterator();
                while (true) {
                    C1434970nRf c1434970nRf = null;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (next instanceof CreateBaseAwemeResponse) {
                        if (next != null) {
                            CreateBaseAwemeResponse createBaseAwemeResponse = (CreateBaseAwemeResponse) next;
                            C1434660nRA c1434660nRA2 = this.LJ;
                            C1434970nRf c1434970nRf2 = this.LJIIIIZZ;
                            if (c1434970nRf2 != null) {
                                c1434970nRf = c1434970nRf2;
                            }
                            c1434660nRA2.LIZJ(createBaseAwemeResponse, false, c1434970nRf.LIZ);
                            return;
                        }
                    }
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse");
            }
        };
        this.LJFF.LJFF();
        C2280661EOq c2280661EOq = new C2280661EOq(str2, abstractC1446660nkW, C1434840nRS.LIZIZ());
        C1D80 c1d8010 = this.LJI;
        if (c1d8010 == null) {
            c1d8010 = null;
        }
        c1d8010.LIZ(c2280661EOq);
        this.LJIILJJIL = c2280661EOq;
        C1D80 c1d8011 = this.LJI;
        if (c1d8011 == null) {
            c1d8011 = null;
        }
        AbstractC1446660nkW abstractC1446660nkW2 = new AbstractC1446660nkW(c1434660nRA) { // from class: X.0nPN
            public final C1434660nRA LJ;

            @Override // X.AbstractC1446660nkW
            public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
            }

            @Override // X.AbstractC1446660nkW
            public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) {
            }

            @Override // X.AbstractC1446660nkW
            public final void LJ(Object obj, C1404610meh c1404610meh) {
            }

            @Override // X.AbstractC1446660nkW
            public final void LJFF(Object obj, Object obj2, boolean z2, int i, int i2) {
            }

            {
                super(2, (Object) null);
                this.LJ = c1434660nRA;
            }

            @Override // X.AbstractC1446660nkW
            public final void LIZIZ(C556300Lro c556300Lro, Object obj, Object obj2) {
                if (obj2 instanceof C1431030nLJ) {
                    this.LJ.LIZLLL(((C1431030nLJ) obj2).LIZ);
                    return;
                }
                if (Intrinsics.LJFF(obj2, C1431170nLX.LIZ)) {
                    C1434660nRA c1434660nRA2 = this.LJ;
                    c1434660nRA2.LLILLJJLI.onStageUpdate("STAGE_SYNTHETIC_PAUSE", new C1433370nP5(new C1433390nP7("")), c1434660nRA2.LL.LIZ);
                } else {
                    if (!Intrinsics.LJFF(obj2, C1431160nLW.LIZ)) {
                        return;
                    }
                    C1434660nRA c1434660nRA3 = this.LJ;
                    c1434660nRA3.LLILLJJLI.onStageUpdate("STAGE_SYNTHETIC_RESUME", new C1433370nP5(new C1433390nP7("")), c1434660nRA3.LL.LIZ);
                }
            }
        };
        this.LJFF.LJFF();
        c1d8011.LIZ(new C2280661EOq(null, abstractC1446660nkW2, C1434840nRS.LIZIZ()));
        if (C1428520nHG.LJJJI(this.LJIIIZ.LIZ) && this.LJIIJ.LIZ.retryType == EnumC1405170mfb.NOT_RETRY) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayListLIZ = C1434870nRV.LIZ(false, z, C1428470nHB.LJJJLL(this.LJIIIZ.LIZ), false, false, 24);
        AwS636S0100000_22 awS636S0100000_22 = new AwS636S0100000_22(this, 54);
        if (this.LJIIIZ.LIZ.getTtStoryUploadModel() != null) {
            c1435900nTA = new C1436140nTY(arrayListLIZ, this.LJFF, awS636S0100000_22);
        } else {
            c1435900nTA = new C1435900nTA(arrayListLIZ, this.LJFF, "DefaultWavePublisher", awS636S0100000_22);
        }
        C1D80 c1d8012 = this.LJI;
        if (c1d8012 == null) {
            c1d8012 = null;
        }
        c1d8012.LIZ(c1435900nTA);
        C1D80 c1d8013 = this.LJI;
        if (c1d8013 == null) {
            c1d8013 = null;
        }
        C575070Mgz.LIZ(c1d8013, new AwS601S0100000_22(this, 744));
        C1D80 c1d8014 = this.LJI;
        if (c1d8014 == null) {
            c1d8014 = null;
        }
        c1d8014.LIZ(new C1405300mfo());
        C1D80 c1d8015 = this.LJI;
        if (c1d8015 == null) {
            c1d8015 = null;
        }
        c1d8015.LIZ(new C1404830mf3("DefaultWavePublisher"));
        C1D80 c1d8016 = this.LJI;
        if (c1d8016 == null) {
            c1d8016 = null;
        }
        c1d8016.LIZ(new C1437450nVf());
        C1D80 c1d8017 = this.LJI;
        if (c1d8017 == null) {
            c1d8017 = null;
        }
        c1d8017.LIZ(new C1404640mek(new AwS566S0100000_22(this, 981)));
        C1D80 c1d8018 = this.LJI;
        if (c1d8018 == null) {
            c1d8018 = null;
        }
        c1d8018.LIZ(new AbstractC1446660nkW() { // from class: X.0nRW
            @Override // X.AbstractC1446660nkW
            public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
            }

            @Override // X.AbstractC1446660nkW
            public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) {
            }

            @Override // X.AbstractC1446660nkW
            public final void LJ(Object obj, C1404610meh c1404610meh) {
            }

            @Override // X.AbstractC1446660nkW
            public final void LJFF(Object obj, Object obj2, boolean z2, int i, int i2) {
            }

            {
                EnumC1434770nRL enumC1434770nRL = EnumC1434770nRL.COMPILE;
            }

            @Override // X.AbstractC1446660nkW, X.InterfaceC1840230xzJ
            public void onEvent(AbstractC556190Lrd abstractC556190Lrd) {
                super.onEvent(abstractC556190Lrd);
                if (abstractC556190Lrd.LIZ == EnumC1434770nRL.COMPILE) {
                    if ((abstractC556190Lrd instanceof C556250Lrj) || (abstractC556190Lrd instanceof C556230Lrh)) {
                        C0CNO.LIZLLL(0L, AFwS210S0000000_22.get$arr$(286));
                    }
                }
            }
        });
        C1D80 c1d8019 = this.LJI;
        if (c1d8019 == null) {
            c1d8019 = null;
        }
        c1d8019.LIZ(new AbstractC1446660nkW() { // from class: X.0mf1
            public VideoPublishEditModel LJ;
            public InterfaceC1434300nQa LJFF;
            public final C01GW LJI;

            @Override // X.AbstractC1446660nkW
            public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
            }

            @Override // X.AbstractC1446660nkW
            public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) {
            }

            {
                EnumC1434770nRL enumC1434770nRL = EnumC1434770nRL.AUTH_KEY;
                this.LJI = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(285));
            }

            @Override // X.AbstractC1446660nkW
            public final void LJ(Object obj, C1404610meh c1404610meh) {
                Iterator<Object> it2 = c1404610meh.LIZ.iterator();
                while (true) {
                    VideoPublishEditModel videoPublishEditModel = null;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (next instanceof C1434960nRe) {
                        if (next != null) {
                            this.LJ = ((C1434960nRe) next).LIZ;
                            Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                Object next2 = it3.next();
                                if (next2 instanceof C1434970nRf) {
                                    if (next2 != null) {
                                        Iterator<Object> it4 = c1404610meh.LIZ.iterator();
                                        while (true) {
                                            if (!it4.hasNext()) {
                                                break;
                                            }
                                            Object next3 = it4.next();
                                            if (next3 instanceof C1405220mfg) {
                                                if (next3 != null) {
                                                    Iterator<Object> it5 = c1404610meh.LIZ.iterator();
                                                    while (true) {
                                                        if (!it5.hasNext()) {
                                                            break;
                                                        }
                                                        Object next4 = it5.next();
                                                        if (next4 instanceof C1404570med) {
                                                            if (next4 != null) {
                                                                Iterator<Object> it6 = c1404610meh.LIZ.iterator();
                                                                while (true) {
                                                                    if (!it6.hasNext()) {
                                                                        break;
                                                                    }
                                                                    Object next5 = it6.next();
                                                                    if (next5 instanceof InterfaceC1434300nQa) {
                                                                        if (next5 != null) {
                                                                            this.LJFF = (InterfaceC1434300nQa) next5;
                                                                            C1404820mf2 c1404820mf2 = (C1404820mf2) this.LJI.getValue();
                                                                            c1404820mf2.getClass();
                                                                            C138P c138p = new C138P(C1411880mqQ.LIZIZ);
                                                                            c138p.LIZLLL();
                                                                            c1404820mf2.LIZ = c138p;
                                                                            InterfaceC1434300nQa interfaceC1434300nQa = this.LJFF;
                                                                            if (interfaceC1434300nQa == null) {
                                                                                interfaceC1434300nQa = null;
                                                                            }
                                                                            C1434440nQo c1434440nQoLJ = interfaceC1434300nQa.LJ();
                                                                            C0LAB c0lab = new C0LAB();
                                                                            VideoPublishEditModel videoPublishEditModel2 = this.LJ;
                                                                            if (videoPublishEditModel2 != null) {
                                                                                videoPublishEditModel = videoPublishEditModel2;
                                                                            }
                                                                            c0lab.LJ("shoot_entrance", videoPublishEditModel.mShootWay);
                                                                            c0lab.LJ("is_photo", CardStruct.IStatusCode.DEFAULT);
                                                                            Map<String, String> map = c0lab.LIZ;
                                                                            c1434440nQoLJ.getClass();
                                                                            C20684815ws.LJIILLIIL("publish_start", map);
                                                                            return;
                                                                        }
                                                                    }
                                                                }
                                                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.publisherbuilder.ITaskExternalDependencyFactory");
                                                            }
                                                        }
                                                    }
                                                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishId");
                                                }
                                            }
                                        }
                                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.normal.ClickPublishWaiter");
                                    }
                                }
                            }
                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
                        }
                    }
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
            }

            @Override // X.AbstractC1446660nkW
            public final void LJFF(Object obj, Object obj2, boolean z2, int i, int i2) {
                C1404820mf2 c1404820mf2 = (C1404820mf2) this.LJI.getValue();
                C138P c138p = c1404820mf2.LIZ;
                if (c138p != null && c138p.LIZIZ) {
                    c138p.LJ();
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[1];
                    if (c1404820mf2.LIZ != null) {
                        objArr[0] = Float.valueOf(r1.LIZIZ(TimeUnit.NANOSECONDS) / 1.0E9f);
                        String strK4 = C786410Ut5.k4(locale, "%.2f", objArr);
                        C0LAB c0lab = new C0LAB();
                        c0lab.LJ("duration", strK4);
                        C20684815ws.LJIILLIIL("get_video_key", c0lab.LIZ);
                        return;
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        });
        C1D80 c1d8020 = this.LJI;
        if (c1d8020 == null) {
            c1d8020 = null;
        }
        c1d8020.LIZ(new C1404720mes());
        C1D80 c1d8021 = this.LJI;
        if (c1d8021 == null) {
            c1d8021 = null;
        }
        c1d8021.LIZ(new C1404480meU());
        C1D80 c1d8022 = this.LJI;
        if (c1d8022 == null) {
            c1d8022 = null;
        }
        c1d8022.LIZ(new C1436320nTq());
        C1D80 c1d8023 = this.LJI;
        if (c1d8023 == null) {
            c1d8023 = null;
        }
        c1d8023.LIZ(new AbstractC1446660nkW() { // from class: X.0nLg
            public VideoPublishEditModel LJ;
            public C1405220mfg LJFF;
            public C1404570med LJI;
            public PublishModel LJII;
            public InterfaceC1434300nQa LJIIIIZZ;
            public C556300Lro LJIIIZ;

            @Override // X.AbstractC1446660nkW
            public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
            }

            {
                Collections.singletonList(EnumC1434770nRL.COMPILE);
            }

            public final C1431320nLm LJI(C543670LTx c543670LTx) {
                C1431320nLm c1431320nLm = new C1431320nLm(c543670LTx);
                C1404570med c1404570med = this.LJI;
                PublishModel publishModel = null;
                if (c1404570med == null) {
                    c1404570med = null;
                }
                c1431320nLm.LIZIZ = c1404570med.LIZ;
                VideoPublishEditModel videoPublishEditModel = this.LJ;
                if (videoPublishEditModel == null) {
                    videoPublishEditModel = null;
                }
                c1431320nLm.LIZJ = videoPublishEditModel;
                c1431320nLm.LIZLLL = EnumC1434810nRP.COMPILE;
                c1431320nLm.LJ = EnumC1404580mee.VIDEO;
                c1431320nLm.LIZ();
                PublishModel publishModel2 = this.LJII;
                if (publishModel2 != null) {
                    publishModel = publishModel2;
                }
                c1431320nLm.LIZLLL(publishModel.LIZJ());
                return c1431320nLm;
            }

            @Override // X.AbstractC1446660nkW, X.InterfaceC1840230xzJ
            public void onEvent(AbstractC556190Lrd abstractC556190Lrd) {
                super.onEvent(abstractC556190Lrd);
                if (abstractC556190Lrd.LIZ == EnumC1434770nRL.COMPILE && (abstractC556190Lrd instanceof C556240Lri)) {
                    this.LJIIIZ = abstractC556190Lrd.LIZIZ;
                }
            }

            @Override // X.AbstractC1446660nkW
            public final void LJ(Object obj, C1404610meh c1404610meh) {
                Iterator<Object> it2 = c1404610meh.LIZ.iterator();
                while (true) {
                    InterfaceC1434300nQa interfaceC1434300nQa = null;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (next instanceof C1434960nRe) {
                        if (next != null) {
                            this.LJ = ((C1434960nRe) next).LIZ;
                            Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                Object next2 = it3.next();
                                if (next2 instanceof C1434970nRf) {
                                    if (next2 != null) {
                                        this.LJII = ((C1434970nRf) next2).LIZ;
                                        Iterator<Object> it4 = c1404610meh.LIZ.iterator();
                                        while (true) {
                                            if (!it4.hasNext()) {
                                                break;
                                            }
                                            Object next3 = it4.next();
                                            if (next3 instanceof C1405220mfg) {
                                                if (next3 != null) {
                                                    this.LJFF = (C1405220mfg) next3;
                                                    Iterator<Object> it5 = c1404610meh.LIZ.iterator();
                                                    while (true) {
                                                        if (!it5.hasNext()) {
                                                            break;
                                                        }
                                                        Object next4 = it5.next();
                                                        if (next4 instanceof C1404570med) {
                                                            if (next4 != null) {
                                                                this.LJI = (C1404570med) next4;
                                                                Iterator<Object> it6 = c1404610meh.LIZ.iterator();
                                                                while (true) {
                                                                    if (!it6.hasNext()) {
                                                                        break;
                                                                    }
                                                                    Object next5 = it6.next();
                                                                    if (next5 instanceof InterfaceC1434300nQa) {
                                                                        if (next5 != null) {
                                                                            this.LJIIIIZZ = (InterfaceC1434300nQa) next5;
                                                                            C1431320nLm c1431320nLmLJI = LJI(new C543670LTx());
                                                                            c1431320nLmLJI.LIZIZ();
                                                                            c1431320nLmLJI.LJ();
                                                                            JSONObject jSONObjectLJ = c1431320nLmLJI.LJFF(EnumC1405140mfY.START).LJ();
                                                                            InterfaceC1434300nQa interfaceC1434300nQa2 = this.LJIIIIZZ;
                                                                            if (interfaceC1434300nQa2 != null) {
                                                                                interfaceC1434300nQa = interfaceC1434300nQa2;
                                                                            }
                                                                            interfaceC1434300nQa.LJI().getClass();
                                                                            C1637890six.LJ("aweme_movie_publish_error_rate_parallel", -1, jSONObjectLJ);
                                                                            return;
                                                                        }
                                                                    }
                                                                }
                                                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.publisherbuilder.ITaskExternalDependencyFactory");
                                                            }
                                                        }
                                                    }
                                                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishId");
                                                }
                                            }
                                        }
                                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.normal.ClickPublishWaiter");
                                    }
                                }
                            }
                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
                        }
                    }
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
            }

            @Override // X.AbstractC1446660nkW
            public final void LIZJ(Object obj, final C1435220nS4 c1435220nS4, int i, int i2) {
                String str4;
                String vESDKErrorCode;
                C1433670nPZ c1433670nPZ;
                int iLJFF = C1431420nLw.LJFF(c1435220nS4);
                C1431320nLm c1431320nLmLJI = LJI(new C543670LTx());
                c1431320nLmLJI.LIZIZ();
                c1431320nLmLJI.LJ();
                c1431320nLmLJI.LIZJ(new AbstractC1431370nLr(c1435220nS4) { // from class: X.0nLq
                    @Override // X.AbstractC1431370nLr
                    public final String LIZIZ() {
                        C1433670nPZ c1433670nPZ2;
                        C1433230nOr cancelCause;
                        String str5;
                        Throwable th = this.LIZ;
                        if (C1431420nLw.LIZJ(th)) {
                            Throwable cause = th.getCause();
                            if ((cause instanceof C1433670nPZ) && (c1433670nPZ2 = (C1433670nPZ) cause) != null && (cancelCause = c1433670nPZ2.getCancelCause()) != null && (str5 = cancelCause.LIZ) != null) {
                                return str5;
                            }
                        }
                        return "";
                    }

                    @Override // X.AbstractC1431370nLr
                    public final int LIZJ() {
                        return C1431420nLw.LJFF(this.LIZ);
                    }

                    @Override // X.AbstractC1431370nLr
                    public final String LIZLLL() {
                        Throwable cause = this.LIZ.getCause();
                        if (!(cause instanceof C1433670nPZ) || cause == null) {
                            return null;
                        }
                        return cause.getMessage();
                    }

                    @Override // X.AbstractC1431370nLr
                    public final EnumC1436980nUu LJ() {
                        Throwable th = this.LIZ;
                        return C1431420nLw.LIZIZ(th) ? EnumC1436980nUu.CLIENT : C1431420nLw.LIZ(th) ? EnumC1436980nUu.CLIENT : C1431420nLw.LIZJ(th) ? EnumC1436980nUu.CLIENT : EnumC1436980nUu.VESDK;
                    }
                });
                C543670LTx c543670LTxLJFF = c1431320nLmLJI.LJFF(EnumC1405140mfY.FAILED);
                C1405220mfg c1405220mfg = this.LJFF;
                InterfaceC1434300nQa interfaceC1434300nQa = null;
                if (c1405220mfg == null) {
                    c1405220mfg = null;
                }
                if (c1405220mfg.LIZIZ) {
                    str4 = "1";
                } else {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                }
                c543670LTxLJFF.LIZ.put("click_publish", str4);
                Throwable cause = c1435220nS4.getCause();
                if ((cause instanceof C1433670nPZ) && (c1433670nPZ = (C1433670nPZ) cause) != null) {
                    vESDKErrorCode = c1433670nPZ.getVESDKErrorCode();
                } else {
                    vESDKErrorCode = null;
                }
                c543670LTxLJFF.LIZ.put("vesdk_error_code", vESDKErrorCode);
                VideoPublishEditModel videoPublishEditModel = this.LJ;
                if (videoPublishEditModel == null) {
                    videoPublishEditModel = null;
                }
                c543670LTxLJFF.LIZIZ(Integer.valueOf(((Boolean) C280540Az6.LIZ.getValue()).booleanValue() ? 1 : 0), "hit_refactor_expr");
                c543670LTxLJFF.LIZIZ(Integer.valueOf(videoPublishEditModel.isSyntheticHardEncode() ? 1 : 0), "is_hard_code");
                C1442190ndJ c1442190ndJ = videoPublishEditModel.creativeModel.commonMobModel.vqCompileDataModel;
                String str5 = c1442190ndJ.LIZ;
                if (str5 == null) {
                    str5 = "unknown";
                }
                c543670LTxLJFF.LIZLLL("compile_resolution", str5);
                c543670LTxLJFF.LIZIZ(Integer.valueOf(c1442190ndJ.LJI), "encode_stand");
                c543670LTxLJFF.LIZIZ(Integer.valueOf(c1442190ndJ.LJII ? 1 : 0), "have_watermark");
                JSONObject jSONObjectLJ = c543670LTxLJFF.LJ();
                InterfaceC1434300nQa interfaceC1434300nQa2 = this.LJIIIIZZ;
                if (interfaceC1434300nQa2 != null) {
                    interfaceC1434300nQa = interfaceC1434300nQa2;
                }
                interfaceC1434300nQa.LJI().getClass();
                C1637890six.LJ("aweme_movie_publish_error_rate_parallel", iLJFF, jSONObjectLJ);
            }

            @Override // X.AbstractC1446660nkW
            public final void LJFF(Object obj, Object obj2, boolean z2, int i, int i2) {
                String str4;
                SynthetiseResult synthetiseResult = (SynthetiseResult) ((LinkedHashMap) this.LIZIZ).get(EnumC1434770nRL.COMPILE);
                long jCurrentTimeMillis = System.currentTimeMillis();
                C556300Lro c556300Lro = this.LJIIIZ;
                InterfaceC1434300nQa interfaceC1434300nQa = null;
                if (c556300Lro == null) {
                    c556300Lro = null;
                }
                long j = jCurrentTimeMillis - c556300Lro.LIZ;
                C1431320nLm c1431320nLmLJI = LJI(new C543670LTx());
                c1431320nLmLJI.LIZIZ();
                c1431320nLmLJI.LJ();
                C543670LTx c543670LTxLJFF = c1431320nLmLJI.LJFF(EnumC1405140mfY.SUCCESS);
                C1405220mfg c1405220mfg = this.LJFF;
                if (c1405220mfg == null) {
                    c1405220mfg = null;
                }
                if (c1405220mfg.LIZIZ) {
                    str4 = "1";
                } else {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                }
                c543670LTxLJFF.LIZ.put("click_publish", str4);
                VideoPublishEditModel videoPublishEditModel = this.LJ;
                if (videoPublishEditModel == null) {
                    videoPublishEditModel = null;
                }
                if (new C0VSJ(videoPublishEditModel.getRealSynthesisFile()).exists()) {
                    VideoPublishEditModel videoPublishEditModel2 = this.LJ;
                    if (videoPublishEditModel2 == null) {
                        videoPublishEditModel2 = null;
                    }
                    c543670LTxLJFF.LIZ.put("speed", Float.valueOf(videoPublishEditModel2.getVideoLength() / j));
                    c543670LTxLJFF.LIZJ(Long.valueOf(j), "duration");
                }
                if (synthetiseResult.audioLength - synthetiseResult.videoLength > 3000.0f) {
                    c543670LTxLJFF.LIZ.put("compile_lost_video", Boolean.TRUE);
                    c543670LTxLJFF.LIZLLL("fileInfo", String.valueOf(obj2));
                }
                List<String> skipFrameLogList = synthetiseResult.getSkipFrameLogList();
                if (!skipFrameLogList.isEmpty()) {
                    c543670LTxLJFF.LIZ.put("compile_skip_frame", skipFrameLogList.toString());
                    c543670LTxLJFF.LIZIZ(Integer.valueOf(skipFrameLogList.size()), "compile_skip_frame_size");
                }
                JSONObject jSONObjectLJ = c543670LTxLJFF.LJ();
                InterfaceC1434300nQa interfaceC1434300nQa2 = this.LJIIIIZZ;
                if (interfaceC1434300nQa2 != null) {
                    interfaceC1434300nQa = interfaceC1434300nQa2;
                }
                interfaceC1434300nQa.LJI().getClass();
                C1637890six.LJ("aweme_movie_publish_error_rate_parallel", 0, jSONObjectLJ);
            }
        });
        C1D80 c1d8024 = this.LJI;
        if (c1d8024 == null) {
            c1d8024 = null;
        }
        c1d8024.LIZ(new AbstractC1446660nkW() { // from class: X.0nLi
            public VideoPublishEditModel LJ;
            public C1405220mfg LJFF;
            public C1404570med LJI;
            public PublishModel LJII;
            public InterfaceC1434300nQa LJIIIIZZ;
            public C556300Lro LJIIIZ;

            @Override // X.AbstractC1446660nkW
            public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
            }

            {
                EnumC1434770nRL enumC1434770nRL = EnumC1434770nRL.UPLOAD;
                Collections.singletonList(EnumC1434770nRL.COMPILE);
            }

            public final C1431320nLm LJI(C543670LTx c543670LTx) {
                C1431320nLm c1431320nLm = new C1431320nLm(c543670LTx);
                C1404570med c1404570med = this.LJI;
                PublishModel publishModel = null;
                if (c1404570med == null) {
                    c1404570med = null;
                }
                c1431320nLm.LIZIZ = c1404570med.LIZ;
                VideoPublishEditModel videoPublishEditModel = this.LJ;
                if (videoPublishEditModel == null) {
                    videoPublishEditModel = null;
                }
                c1431320nLm.LIZJ = videoPublishEditModel;
                c1431320nLm.LIZLLL = EnumC1434810nRP.UPLOAD;
                c1431320nLm.LJ = EnumC1404580mee.VIDEO;
                c1431320nLm.LIZ();
                PublishModel publishModel2 = this.LJII;
                if (publishModel2 != null) {
                    publishModel = publishModel2;
                }
                c1431320nLm.LIZLLL(publishModel.LIZJ());
                return c1431320nLm;
            }

            @Override // X.AbstractC1446660nkW, X.InterfaceC1840230xzJ
            public void onEvent(AbstractC556190Lrd abstractC556190Lrd) {
                super.onEvent(abstractC556190Lrd);
                if (abstractC556190Lrd.LIZ == EnumC1434770nRL.UPLOAD && (abstractC556190Lrd instanceof C556240Lri)) {
                    this.LJIIIZ = abstractC556190Lrd.LIZIZ;
                }
            }

            @Override // X.AbstractC1446660nkW
            public final void LJ(Object obj, C1404610meh c1404610meh) {
                Iterator<Object> it2 = c1404610meh.LIZ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (next instanceof C1434960nRe) {
                        if (next != null) {
                            this.LJ = ((C1434960nRe) next).LIZ;
                            Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                Object next2 = it3.next();
                                if (next2 instanceof C1434970nRf) {
                                    if (next2 != null) {
                                        this.LJII = ((C1434970nRf) next2).LIZ;
                                        Iterator<Object> it4 = c1404610meh.LIZ.iterator();
                                        while (true) {
                                            if (!it4.hasNext()) {
                                                break;
                                            }
                                            Object next3 = it4.next();
                                            if (next3 instanceof C1405220mfg) {
                                                if (next3 != null) {
                                                    this.LJFF = (C1405220mfg) next3;
                                                    Iterator<Object> it5 = c1404610meh.LIZ.iterator();
                                                    while (true) {
                                                        if (!it5.hasNext()) {
                                                            break;
                                                        }
                                                        Object next4 = it5.next();
                                                        if (next4 instanceof C1404570med) {
                                                            if (next4 != null) {
                                                                this.LJI = (C1404570med) next4;
                                                                Iterator<Object> it6 = c1404610meh.LIZ.iterator();
                                                                while (true) {
                                                                    if (!it6.hasNext()) {
                                                                        break;
                                                                    }
                                                                    Object next5 = it6.next();
                                                                    if (next5 instanceof InterfaceC1434300nQa) {
                                                                        if (next5 != null) {
                                                                            this.LJIIIIZZ = (InterfaceC1434300nQa) next5;
                                                                            return;
                                                                        }
                                                                    }
                                                                }
                                                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.publisherbuilder.ITaskExternalDependencyFactory");
                                                            }
                                                        }
                                                    }
                                                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishId");
                                                }
                                            }
                                        }
                                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.normal.ClickPublishWaiter");
                                    }
                                }
                            }
                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
                        }
                    }
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
            }

            @Override // X.AbstractC1446660nkW
            public final void LIZJ(Object obj, final C1435220nS4 c1435220nS4, int i, int i2) {
                String str4;
                if (c1435220nS4 != null) {
                    C08KI.LIZ(c1435220nS4);
                }
                int iLJII = C1431420nLw.LJII(c1435220nS4);
                C543670LTx c543670LTx = new C543670LTx();
                InterfaceC1434300nQa interfaceC1434300nQa = this.LJIIIIZZ;
                C1405220mfg c1405220mfg = null;
                if (interfaceC1434300nQa == null) {
                    interfaceC1434300nQa = null;
                }
                C1434450nQp c1434450nQpLJI = interfaceC1434300nQa.LJI();
                C1431320nLm c1431320nLmLJI = LJI(c543670LTx);
                c1431320nLmLJI.LIZIZ();
                c1431320nLmLJI.LJ();
                c1431320nLmLJI.LIZJ(new AbstractC1431370nLr(c1435220nS4) { // from class: X.0nLs
                    @Override // X.AbstractC1431370nLr
                    public final EnumC1436980nUu LJ() {
                        return C1431420nLw.LIZIZ(this.LIZ) ? EnumC1436980nUu.CLIENT : EnumC1436980nUu.UPLOAD_SDK;
                    }

                    @Override // X.AbstractC1431370nLr
                    public final int LIZJ() {
                        return C1431420nLw.LJII(LIZ());
                    }
                });
                C543670LTx c543670LTxLJFF = c1431320nLmLJI.LJFF(EnumC1405140mfY.FAILED);
                VideoPublishEditModel videoPublishEditModel = this.LJ;
                if (videoPublishEditModel == null) {
                    videoPublishEditModel = null;
                }
                c543670LTxLJFF.LIZ.put("is_hd_video", Integer.valueOf(C1437030nUz.LJ(videoPublishEditModel) ? 1 : 0));
                C1405220mfg c1405220mfg2 = this.LJFF;
                if (c1405220mfg2 != null) {
                    c1405220mfg = c1405220mfg2;
                }
                if (c1405220mfg.LIZIZ) {
                    str4 = "1";
                } else {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                }
                c543670LTxLJFF.LIZ.put("click_publish", str4);
                JSONObject jSONObjectLJ = c543670LTxLJFF.LJ();
                c1434450nQpLJI.getClass();
                C1637890six.LJ("aweme_movie_publish_error_rate_parallel", iLJII, jSONObjectLJ);
            }

            @Override // X.AbstractC1446660nkW
            public final void LJFF(Object obj, Object obj2, boolean z2, int i, int i2) {
                String str4;
                C1431320nLm c1431320nLmLJI = LJI(new C543670LTx());
                c1431320nLmLJI.LIZIZ();
                c1431320nLmLJI.LJ();
                C543670LTx c543670LTxLJFF = c1431320nLmLJI.LJFF(EnumC1405140mfY.SUCCESS);
                C1405220mfg c1405220mfg = this.LJFF;
                InterfaceC1434300nQa interfaceC1434300nQa = null;
                if (c1405220mfg == null) {
                    c1405220mfg = null;
                }
                if (c1405220mfg.LIZIZ) {
                    str4 = "1";
                } else {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                }
                c543670LTxLJFF.LIZ.put("click_publish", str4);
                VideoPublishEditModel videoPublishEditModel = this.LJ;
                if (videoPublishEditModel == null) {
                    videoPublishEditModel = null;
                }
                if (new C0VSJ(videoPublishEditModel.getRealSynthesisFile()).exists()) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C556300Lro c556300Lro = this.LJIIIZ;
                    if (c556300Lro == null) {
                        c556300Lro = null;
                    }
                    long j = jCurrentTimeMillis - c556300Lro.LIZ;
                    VideoPublishEditModel videoPublishEditModel2 = this.LJ;
                    if (videoPublishEditModel2 == null) {
                        videoPublishEditModel2 = null;
                    }
                    c543670LTxLJFF.LIZ.put("speed", Float.valueOf(new C0VSJ(videoPublishEditModel2.getRealSynthesisFile()).length() / j));
                    c543670LTxLJFF.LIZJ(Long.valueOf(j), "duration");
                }
                JSONObject jSONObjectLJ = c543670LTxLJFF.LJ();
                InterfaceC1434300nQa interfaceC1434300nQa2 = this.LJIIIIZZ;
                if (interfaceC1434300nQa2 != null) {
                    interfaceC1434300nQa = interfaceC1434300nQa2;
                }
                interfaceC1434300nQa.LJI().getClass();
                C1637890six.LJ("aweme_movie_publish_error_rate_parallel", 0, jSONObjectLJ);
            }
        });
        C1D80 c1d8025 = this.LJI;
        if (c1d8025 == null) {
            c1d8025 = null;
        }
        c1d8025.LIZ(new AbstractC1446660nkW() { // from class: X.0nLk
            public VideoPublishEditModel LJ;
            public C1405220mfg LJFF;
            public C1404570med LJI;
            public PublishModel LJII;
            public InterfaceC1434300nQa LJIIIIZZ;

            @Override // X.AbstractC1446660nkW
            public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
            }

            {
                EnumC1434770nRL enumC1434770nRL = EnumC1434770nRL.AUTH_KEY;
            }

            public final C1431320nLm LJI(C543670LTx c543670LTx) {
                C1431320nLm c1431320nLm = new C1431320nLm(c543670LTx);
                C1404570med c1404570med = this.LJI;
                PublishModel publishModel = null;
                if (c1404570med == null) {
                    c1404570med = null;
                }
                c1431320nLm.LIZIZ = c1404570med.LIZ;
                VideoPublishEditModel videoPublishEditModel = this.LJ;
                if (videoPublishEditModel == null) {
                    videoPublishEditModel = null;
                }
                c1431320nLm.LIZJ = videoPublishEditModel;
                c1431320nLm.LIZLLL = EnumC1434810nRP.AUTH_KEY;
                c1431320nLm.LJ = EnumC1404580mee.VIDEO;
                c1431320nLm.LIZ();
                c1431320nLm.LIZIZ();
                PublishModel publishModel2 = this.LJII;
                if (publishModel2 != null) {
                    publishModel = publishModel2;
                }
                c1431320nLm.LIZLLL(publishModel.LIZJ());
                return c1431320nLm;
            }

            @Override // X.AbstractC1446660nkW
            public final void LJ(Object obj, C1404610meh c1404610meh) {
                Iterator<Object> it2 = c1404610meh.LIZ.iterator();
                while (true) {
                    VideoPublishEditModel videoPublishEditModel = null;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (next instanceof C1434960nRe) {
                        if (next != null) {
                            this.LJ = ((C1434960nRe) next).LIZ;
                            Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                Object next2 = it3.next();
                                if (next2 instanceof C1434970nRf) {
                                    if (next2 != null) {
                                        this.LJII = ((C1434970nRf) next2).LIZ;
                                        Iterator<Object> it4 = c1404610meh.LIZ.iterator();
                                        while (true) {
                                            if (!it4.hasNext()) {
                                                break;
                                            }
                                            Object next3 = it4.next();
                                            if (next3 instanceof C1405220mfg) {
                                                if (next3 != null) {
                                                    this.LJFF = (C1405220mfg) next3;
                                                    Iterator<Object> it5 = c1404610meh.LIZ.iterator();
                                                    while (true) {
                                                        if (!it5.hasNext()) {
                                                            break;
                                                        }
                                                        Object next4 = it5.next();
                                                        if (next4 instanceof C1404570med) {
                                                            if (next4 != null) {
                                                                this.LJI = (C1404570med) next4;
                                                                Iterator<Object> it6 = c1404610meh.LIZ.iterator();
                                                                while (true) {
                                                                    if (!it6.hasNext()) {
                                                                        break;
                                                                    }
                                                                    Object next5 = it6.next();
                                                                    if (next5 instanceof InterfaceC1434300nQa) {
                                                                        if (next5 != null) {
                                                                            this.LJIIIIZZ = (InterfaceC1434300nQa) next5;
                                                                            C543670LTx c543670LTx = new C543670LTx();
                                                                            InterfaceC1434300nQa interfaceC1434300nQa = this.LJIIIIZZ;
                                                                            if (interfaceC1434300nQa == null) {
                                                                                interfaceC1434300nQa = null;
                                                                            }
                                                                            C1434450nQp c1434450nQpLJI = interfaceC1434300nQa.LJI();
                                                                            C1431320nLm c1431320nLmLJI = LJI(c543670LTx);
                                                                            c1431320nLmLJI.LJ();
                                                                            C543670LTx c543670LTxLJFF = c1431320nLmLJI.LJFF(EnumC1405140mfY.START);
                                                                            VideoPublishEditModel videoPublishEditModel2 = this.LJ;
                                                                            if (videoPublishEditModel2 != null) {
                                                                                videoPublishEditModel = videoPublishEditModel2;
                                                                            }
                                                                            c543670LTxLJFF.LIZ.put("is_hd_video", Integer.valueOf(C1437030nUz.LJ(videoPublishEditModel) ? 1 : 0));
                                                                            JSONObject jSONObjectLJ = c543670LTxLJFF.LJ();
                                                                            c1434450nQpLJI.getClass();
                                                                            C1637890six.LJ("aweme_movie_publish_error_rate_parallel", -1, jSONObjectLJ);
                                                                            return;
                                                                        }
                                                                    }
                                                                }
                                                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.publisherbuilder.ITaskExternalDependencyFactory");
                                                            }
                                                        }
                                                    }
                                                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishId");
                                                }
                                            }
                                        }
                                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.normal.ClickPublishWaiter");
                                    }
                                }
                            }
                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
                        }
                    }
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
            }

            @Override // X.AbstractC1446660nkW
            public final void LIZJ(Object obj, final C1435220nS4 c1435220nS4, int i, int i2) {
                String str4;
                int iLJI = C1431420nLw.LJI(11, c1435220nS4);
                C1431320nLm c1431320nLmLJI = LJI(new C543670LTx());
                c1431320nLmLJI.LJ();
                c1431320nLmLJI.LIZJ(new AbstractC1431370nLr(c1435220nS4) { // from class: X.0nLo
                    @Override // X.AbstractC1431370nLr
                    public final int LIZJ() {
                        return C1431420nLw.LJI(11, LIZ());
                    }

                    @Override // X.AbstractC1431370nLr
                    public final EnumC1436980nUu LJ() {
                        if (LIZ() instanceof C1431430nLx) {
                            return EnumC1436980nUu.CLIENT;
                        }
                        try {
                            if (C036E.LIZ.LIZIZ()) {
                                return EnumC1436980nUu.CLIENT;
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        return EnumC1436980nUu.SERVER;
                    }
                });
                C543670LTx c543670LTxLJFF = c1431320nLmLJI.LJFF(EnumC1405140mfY.FAILED);
                InterfaceC1434300nQa interfaceC1434300nQa = this.LJIIIIZZ;
                VideoPublishEditModel videoPublishEditModel = null;
                if (interfaceC1434300nQa == null) {
                    interfaceC1434300nQa = null;
                }
                C1434450nQp c1434450nQpLJI = interfaceC1434300nQa.LJI();
                C1405220mfg c1405220mfg = this.LJFF;
                if (c1405220mfg == null) {
                    c1405220mfg = null;
                }
                if (c1405220mfg.LIZIZ) {
                    str4 = "1";
                } else {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                }
                c543670LTxLJFF.LIZ.put("click_publish", str4);
                VideoPublishEditModel videoPublishEditModel2 = this.LJ;
                if (videoPublishEditModel2 != null) {
                    videoPublishEditModel = videoPublishEditModel2;
                }
                c543670LTxLJFF.LIZ.put("is_hd_video", Integer.valueOf(C1437030nUz.LJ(videoPublishEditModel) ? 1 : 0));
                JSONObject jSONObjectLJ = c543670LTxLJFF.LJ();
                c1434450nQpLJI.getClass();
                C1637890six.LJ("aweme_movie_publish_error_rate_parallel", iLJI, jSONObjectLJ);
            }

            @Override // X.AbstractC1446660nkW
            public final void LJFF(Object obj, Object obj2, boolean z2, int i, int i2) {
                C1431320nLm c1431320nLmLJI = LJI(new C543670LTx());
                c1431320nLmLJI.LJ();
                JSONObject jSONObjectLJ = c1431320nLmLJI.LJFF(EnumC1405140mfY.SUCCESS).LJ();
                InterfaceC1434300nQa interfaceC1434300nQa = this.LJIIIIZZ;
                if (interfaceC1434300nQa == null) {
                    interfaceC1434300nQa = null;
                }
                interfaceC1434300nQa.LJI().getClass();
                C1637890six.LJ("aweme_movie_publish_error_rate_parallel", 0, jSONObjectLJ);
            }
        });
        C1D80 c1d8026 = this.LJI;
        if (c1d8026 == null) {
            c1d8026 = null;
        }
        c1d8026.LIZ(new AbstractC1446660nkW() { // from class: X.0nLj
            public VideoPublishEditModel LJ;
            public C1404570med LJFF;
            public PublishModel LJI;
            public InterfaceC1434300nQa LJII;

            @Override // X.AbstractC1446660nkW
            public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
            }

            {
                EnumC1434770nRL enumC1434770nRL = EnumC1434770nRL.COVER_TEXT_UPLOAD;
            }

            @Override // X.AbstractC1446660nkW
            public final void LJ(Object obj, C1404610meh c1404610meh) {
                Iterator<Object> it2 = c1404610meh.LIZ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (next instanceof C1434960nRe) {
                        if (next != null) {
                            this.LJ = ((C1434960nRe) next).LIZ;
                            Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                Object next2 = it3.next();
                                if (next2 instanceof C1434970nRf) {
                                    if (next2 != null) {
                                        this.LJI = ((C1434970nRf) next2).LIZ;
                                        Iterator<Object> it4 = c1404610meh.LIZ.iterator();
                                        while (true) {
                                            if (!it4.hasNext()) {
                                                break;
                                            }
                                            Object next3 = it4.next();
                                            if (next3 instanceof C1405220mfg) {
                                                if (next3 != null) {
                                                    Iterator<Object> it5 = c1404610meh.LIZ.iterator();
                                                    while (true) {
                                                        if (!it5.hasNext()) {
                                                            break;
                                                        }
                                                        Object next4 = it5.next();
                                                        if (next4 instanceof C1404570med) {
                                                            if (next4 != null) {
                                                                this.LJFF = (C1404570med) next4;
                                                                Iterator<Object> it6 = c1404610meh.LIZ.iterator();
                                                                while (true) {
                                                                    if (!it6.hasNext()) {
                                                                        break;
                                                                    }
                                                                    Object next5 = it6.next();
                                                                    if (next5 instanceof InterfaceC1434300nQa) {
                                                                        if (next5 != null) {
                                                                            this.LJII = (InterfaceC1434300nQa) next5;
                                                                            return;
                                                                        }
                                                                    }
                                                                }
                                                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.publisherbuilder.ITaskExternalDependencyFactory");
                                                            }
                                                        }
                                                    }
                                                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishId");
                                                }
                                            }
                                        }
                                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.normal.ClickPublishWaiter");
                                    }
                                }
                            }
                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
                        }
                    }
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
            }

            public static C1431320nLm LJI(VideoPublishEditModel videoPublishEditModel, String str4, boolean z2) {
                C1431320nLm c1431320nLm = new C1431320nLm(new C543670LTx());
                c1431320nLm.LIZIZ = str4;
                c1431320nLm.LIZJ = videoPublishEditModel;
                c1431320nLm.LIZLLL = EnumC1434810nRP.COVER_TEXT_UPLOAD;
                c1431320nLm.LJ = EnumC1404580mee.VIDEO;
                c1431320nLm.LIZ();
                c1431320nLm.LIZIZ();
                c1431320nLm.LIZLLL(z2);
                return c1431320nLm;
            }

            @Override // X.AbstractC1446660nkW
            public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) {
                final C1430650nKh c1430650nKh;
                Pair pair;
                Throwable cause = c1435220nS4.getCause();
                InterfaceC1434300nQa interfaceC1434300nQa = null;
                if ((cause instanceof C1430650nKh) && (c1430650nKh = (C1430650nKh) cause) != null) {
                    C1404570med c1404570med = this.LJFF;
                    if (c1404570med == null) {
                        c1404570med = null;
                    }
                    String str4 = c1404570med.LIZ;
                    PublishModel publishModel = this.LJI;
                    if (publishModel == null) {
                        publishModel = null;
                    }
                    boolean zLIZJ = publishModel.LIZJ();
                    VideoPublishEditModel videoPublishEditModel = this.LJ;
                    if (videoPublishEditModel == null) {
                        videoPublishEditModel = null;
                    }
                    final String coverPath = c1430650nKh.getCoverPath();
                    if (coverPath != null && coverPath.length() != 0) {
                        C0VSJ c0vsj = new C0VSJ(coverPath);
                        pair = new Pair(Boolean.valueOf(c0vsj.exists()), Long.valueOf(c0vsj.length()));
                    } else {
                        pair = new Pair(Boolean.FALSE, -1L);
                    }
                    boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
                    long jLongValue = ((Number) pair.getSecond()).longValue();
                    C1431320nLm c1431320nLmLJI = LJI(videoPublishEditModel, str4, zLIZJ);
                    c1431320nLmLJI.LIZJ(new AbstractC1431370nLr(c1430650nKh, coverPath) { // from class: X.0nLn
                        public final String LIZIZ;

                        @Override // X.AbstractC1431370nLr
                        public final EnumC1436980nUu LJ() {
                            String str5 = this.LIZIZ;
                            if (str5 == null || str5.length() == 0) {
                                return EnumC1436980nUu.CLIENT;
                            }
                            C0VSJ c0vsj2 = new C0VSJ(this.LIZIZ);
                            Throwable thLIZ = LIZ();
                            return thLIZ instanceof C1431430nLx ? EnumC1436980nUu.CLIENT : (!c0vsj2.exists() || c0vsj2.length() == 0) ? EnumC1436980nUu.CLIENT : thLIZ instanceof C1434330nQd ? EnumC1436980nUu.UPLOAD_SDK : EnumC1436980nUu.CLIENT;
                        }

                        @Override // X.AbstractC1431370nLr
                        public final int LIZJ() {
                            Throwable thLIZ = LIZ();
                            if (thLIZ instanceof C1430650nKh) {
                                return ((C1431180nLY) thLIZ).getErrorCode();
                            }
                            return 14;
                        }

                        {
                            this.LIZIZ = coverPath;
                        }
                    });
                    C543670LTx c543670LTxLJFF = c1431320nLmLJI.LJFF(EnumC1405140mfY.FAILED);
                    c543670LTxLJFF.LIZ.put("file_exist", Boolean.valueOf(zBooleanValue));
                    c543670LTxLJFF.LIZ.put("file_size", Long.valueOf(jLongValue));
                    c543670LTxLJFF.LIZ.put("file_path", coverPath);
                    JSONObject jSONObjectLJ = c543670LTxLJFF.LJ();
                    InterfaceC1434300nQa interfaceC1434300nQa2 = this.LJII;
                    if (interfaceC1434300nQa2 != null) {
                        interfaceC1434300nQa = interfaceC1434300nQa2;
                    }
                    interfaceC1434300nQa.LJI().getClass();
                    C1637890six.LJ("aweme_movie_publish_error_rate_parallel", 1, jSONObjectLJ);
                }
            }

            @Override // X.AbstractC1446660nkW
            public final void LJFF(Object obj, Object obj2, boolean z2, int i, int i2) {
                C1404570med c1404570med = this.LJFF;
                InterfaceC1434300nQa interfaceC1434300nQa = null;
                if (c1404570med == null) {
                    c1404570med = null;
                }
                String str4 = c1404570med.LIZ;
                PublishModel publishModel = this.LJI;
                if (publishModel == null) {
                    publishModel = null;
                }
                boolean zLIZJ = publishModel.LIZJ();
                VideoPublishEditModel videoPublishEditModel = this.LJ;
                if (videoPublishEditModel == null) {
                    videoPublishEditModel = null;
                }
                JSONObject jSONObjectLJ = LJI(videoPublishEditModel, str4, zLIZJ).LJFF(EnumC1405140mfY.SUCCESS).LJ();
                InterfaceC1434300nQa interfaceC1434300nQa2 = this.LJII;
                if (interfaceC1434300nQa2 != null) {
                    interfaceC1434300nQa = interfaceC1434300nQa2;
                }
                interfaceC1434300nQa.LJI().getClass();
                C1637890six.LJ("aweme_movie_publish_error_rate_parallel", 0, jSONObjectLJ);
            }
        });
        C1D80 c1d8027 = this.LJI;
        if (c1d8027 == null) {
            c1d8027 = null;
        }
        c1d8027.LIZ(new AbstractC1446660nkW() { // from class: X.0nLh
            public VideoPublishEditModel LJ;
            public C1405220mfg LJFF;
            public C1404570med LJI;
            public PublishModel LJII;
            public InterfaceC1434300nQa LJIIIIZZ;

            @Override // X.AbstractC1446660nkW
            public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
            }

            {
                EnumC1434770nRL enumC1434770nRL = EnumC1434770nRL.CREATE_AWEME;
            }

            public final C1431320nLm LJI(C543670LTx c543670LTx) {
                C1431320nLm c1431320nLm = new C1431320nLm(c543670LTx);
                C1404570med c1404570med = this.LJI;
                PublishModel publishModel = null;
                if (c1404570med == null) {
                    c1404570med = null;
                }
                c1431320nLm.LIZIZ = c1404570med.LIZ;
                VideoPublishEditModel videoPublishEditModel = this.LJ;
                if (videoPublishEditModel == null) {
                    videoPublishEditModel = null;
                }
                c1431320nLm.LIZJ = videoPublishEditModel;
                c1431320nLm.LIZLLL = EnumC1434810nRP.CREATE_AWEME;
                c1431320nLm.LJ = EnumC1404580mee.VIDEO;
                c1431320nLm.LIZ();
                PublishModel publishModel2 = this.LJII;
                if (publishModel2 != null) {
                    publishModel = publishModel2;
                }
                c1431320nLm.LIZLLL(publishModel.LIZJ());
                return c1431320nLm;
            }

            @Override // X.AbstractC1446660nkW
            public final void LJ(Object obj, C1404610meh c1404610meh) {
                Iterator<Object> it2 = c1404610meh.LIZ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (next instanceof C1434960nRe) {
                        if (next != null) {
                            this.LJ = ((C1434960nRe) next).LIZ;
                            Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                Object next2 = it3.next();
                                if (next2 instanceof C1434970nRf) {
                                    if (next2 != null) {
                                        this.LJII = ((C1434970nRf) next2).LIZ;
                                        Iterator<Object> it4 = c1404610meh.LIZ.iterator();
                                        while (true) {
                                            if (!it4.hasNext()) {
                                                break;
                                            }
                                            Object next3 = it4.next();
                                            if (next3 instanceof C1405220mfg) {
                                                if (next3 != null) {
                                                    this.LJFF = (C1405220mfg) next3;
                                                    Iterator<Object> it5 = c1404610meh.LIZ.iterator();
                                                    while (true) {
                                                        if (!it5.hasNext()) {
                                                            break;
                                                        }
                                                        Object next4 = it5.next();
                                                        if (next4 instanceof C1404570med) {
                                                            if (next4 != null) {
                                                                this.LJI = (C1404570med) next4;
                                                                Iterator<Object> it6 = c1404610meh.LIZ.iterator();
                                                                while (true) {
                                                                    if (!it6.hasNext()) {
                                                                        break;
                                                                    }
                                                                    Object next5 = it6.next();
                                                                    if (next5 instanceof InterfaceC1434300nQa) {
                                                                        if (next5 != null) {
                                                                            this.LJIIIIZZ = (InterfaceC1434300nQa) next5;
                                                                            return;
                                                                        }
                                                                    }
                                                                }
                                                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.publisherbuilder.ITaskExternalDependencyFactory");
                                                            }
                                                        }
                                                    }
                                                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishId");
                                                }
                                            }
                                        }
                                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.normal.ClickPublishWaiter");
                                    }
                                }
                            }
                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
                        }
                    }
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
            }

            @Override // X.AbstractC1446660nkW
            public final void LIZJ(Object obj, final C1435220nS4 c1435220nS4, int i, int i2) {
                C201955140j.LIZ("PublishDurationMonitor CreateAweme End failed");
                int iLJI = C1431420nLw.LJI(13, c1435220nS4);
                String strLJ = C1431420nLw.LJ(c1435220nS4);
                C1431320nLm c1431320nLmLJI = LJI(new C543670LTx());
                c1431320nLmLJI.LIZIZ();
                c1431320nLmLJI.LJ();
                c1431320nLmLJI.LIZJ(new AbstractC1431370nLr(c1435220nS4) { // from class: X.0nLp
                    @Override // X.AbstractC1431370nLr
                    public final EnumC1436980nUu LJ() {
                        if (C1431420nLw.LIZIZ(this.LIZ)) {
                            return EnumC1436980nUu.CLIENT;
                        }
                        try {
                            if (C036E.LIZ.LIZIZ()) {
                                return EnumC1436980nUu.CLIENT;
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        return EnumC1436980nUu.SERVER;
                    }

                    @Override // X.AbstractC1431370nLr
                    public final int LIZJ() {
                        return C1431420nLw.LJI(13, LIZ());
                    }
                });
                C543670LTx c543670LTxLJFF = c1431320nLmLJI.LJFF(EnumC1405140mfY.FAILED);
                c543670LTxLJFF.LIZ.put("server_log_id", strLJ);
                VideoPublishEditModel videoPublishEditModel = this.LJ;
                InterfaceC1434300nQa interfaceC1434300nQa = null;
                if (videoPublishEditModel == null) {
                    videoPublishEditModel = null;
                }
                c543670LTxLJFF.LIZ.put("is_hd_video", Integer.valueOf(C1437030nUz.LJ(videoPublishEditModel) ? 1 : 0));
                JSONObject jSONObjectLJ = c543670LTxLJFF.LJ();
                InterfaceC1434300nQa interfaceC1434300nQa2 = this.LJIIIIZZ;
                if (interfaceC1434300nQa2 != null) {
                    interfaceC1434300nQa = interfaceC1434300nQa2;
                }
                interfaceC1434300nQa.LJI().getClass();
                C1637890six.LJ("aweme_movie_publish_error_rate_parallel", iLJI, jSONObjectLJ);
            }

            @Override // X.AbstractC1446660nkW
            public final void LJFF(Object obj, Object obj2, boolean z2, int i, int i2) {
                String str4;
                int i3;
                C1431320nLm c1431320nLmLJI = LJI(new C543670LTx());
                c1431320nLmLJI.LIZIZ();
                c1431320nLmLJI.LJ();
                C543670LTx c543670LTxLJFF = c1431320nLmLJI.LJFF(EnumC1405140mfY.SUCCESS);
                VideoPublishEditModel videoPublishEditModel = this.LJ;
                InterfaceC1434300nQa interfaceC1434300nQa = null;
                if (videoPublishEditModel == null) {
                    videoPublishEditModel = null;
                }
                c543670LTxLJFF.LIZ.put("is_hd_video", Integer.valueOf(C1437030nUz.LJ(videoPublishEditModel) ? 1 : 0));
                JSONObject jSONObjectLJ = c543670LTxLJFF.LJ();
                InterfaceC1434300nQa interfaceC1434300nQa2 = this.LJIIIIZZ;
                if (interfaceC1434300nQa2 == null) {
                    interfaceC1434300nQa2 = null;
                }
                interfaceC1434300nQa2.LJI().getClass();
                C1637890six.LJ("aweme_movie_publish_error_rate_parallel", 0, jSONObjectLJ);
                long jCurrentTimeMillis = System.currentTimeMillis();
                C1405220mfg c1405220mfg = this.LJFF;
                if (c1405220mfg == null) {
                    c1405220mfg = null;
                }
                long j = jCurrentTimeMillis - c1405220mfg.LIZIZ().LIZ;
                VideoPublishEditModel videoPublishEditModel2 = this.LJ;
                if (videoPublishEditModel2 == null) {
                    videoPublishEditModel2 = null;
                }
                C0EMD c0emd = C0EMD.LIZ;
                C543670LTx c543670LTx = new C543670LTx();
                c0emd.getClass();
                if ((videoPublishEditModel2 instanceof VideoPublishEditModel) && videoPublishEditModel2 != null) {
                    if (videoPublishEditModel2.isStoryEditMode()) {
                        str4 = "story_shoot_page";
                    } else {
                        str4 = "video_shoot_page";
                    }
                    c543670LTx.LIZLLL("shoot_page", str4);
                    if (videoPublishEditModel2.getTtStoryUploadModel() != null) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    c543670LTx.LIZIZ(Integer.valueOf(i3), "is_story");
                    TTStoryUploadModel ttStoryUploadModel = videoPublishEditModel2.getTtStoryUploadModel();
                    if (ttStoryUploadModel != null) {
                        c543670LTx.LIZIZ(Integer.valueOf(ttStoryUploadModel.getIndex()), "clip_index");
                        c543670LTx.LIZIZ(Integer.valueOf(ttStoryUploadModel.getTotalCount()), "clips_cnt");
                    }
                }
                VideoPublishEditModel videoPublishEditModel3 = this.LJ;
                if (videoPublishEditModel3 == null) {
                    videoPublishEditModel3 = null;
                }
                c543670LTx.LIZ.put("speed", Float.valueOf((new C0VSJ(videoPublishEditModel3.getRealSynthesisFile()).length() * 1.0f) / j));
                c543670LTx.LIZ.put("processTime", Long.valueOf(j));
                JSONObject jSONObjectLJ2 = c543670LTx.LJ();
                InterfaceC1434300nQa interfaceC1434300nQa3 = this.LJIIIIZZ;
                if (interfaceC1434300nQa3 != null) {
                    interfaceC1434300nQa = interfaceC1434300nQa3;
                }
                interfaceC1434300nQa.LJI().getClass();
                C1637890six.LJ("type_av_compose_upload", 0, jSONObjectLJ2);
            }
        });
        C1D80 c1d8028 = this.LJI;
        if (c1d8028 == null) {
            c1d8028 = null;
        }
        c1d8028.LIZ(new AbstractC1446660nkW() { // from class: X.0nLl
            public C1404570med LJ;
            public PublishModel LJFF;
            public VideoPublishEditModel LJI;
            public C1405220mfg LJII;
            public InterfaceC1434300nQa LJIIIIZZ;

            @Override // X.AbstractC1446660nkW
            public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
            }

            @Override // X.AbstractC1446660nkW
            public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) {
            }

            @Override // X.AbstractC1446660nkW
            public final void LJFF(Object obj, Object obj2, boolean z2, int i, int i2) {
            }

            @Override // X.AbstractC1446660nkW
            public final void LJ(Object obj, C1404610meh c1404610meh) {
                Iterator<Object> it2 = c1404610meh.LIZ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (next instanceof C1404570med) {
                        if (next != null) {
                            this.LJ = (C1404570med) next;
                            Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                Object next2 = it3.next();
                                if (next2 instanceof C1434960nRe) {
                                    if (next2 != null) {
                                        this.LJI = ((C1434960nRe) next2).LIZ;
                                        Iterator<Object> it4 = c1404610meh.LIZ.iterator();
                                        while (true) {
                                            if (!it4.hasNext()) {
                                                break;
                                            }
                                            Object next3 = it4.next();
                                            if (next3 instanceof C1434970nRf) {
                                                if (next3 != null) {
                                                    this.LJFF = ((C1434970nRf) next3).LIZ;
                                                    Iterator<Object> it5 = c1404610meh.LIZ.iterator();
                                                    while (true) {
                                                        if (!it5.hasNext()) {
                                                            break;
                                                        }
                                                        Object next4 = it5.next();
                                                        if (next4 instanceof C1405220mfg) {
                                                            if (next4 != null) {
                                                                this.LJII = (C1405220mfg) next4;
                                                                Iterator<Object> it6 = c1404610meh.LIZ.iterator();
                                                                while (true) {
                                                                    if (!it6.hasNext()) {
                                                                        break;
                                                                    }
                                                                    Object next5 = it6.next();
                                                                    if (next5 instanceof InterfaceC1434300nQa) {
                                                                        if (next5 != null) {
                                                                            this.LJIIIIZZ = (InterfaceC1434300nQa) next5;
                                                                            return;
                                                                        }
                                                                    }
                                                                }
                                                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.publisherbuilder.ITaskExternalDependencyFactory");
                                                            }
                                                        }
                                                    }
                                                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.normal.ClickPublishWaiter");
                                                }
                                            }
                                        }
                                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
                                    }
                                }
                            }
                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
                        }
                    }
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishId");
            }

            @Override // X.AbstractC1446660nkW
            public final void LIZIZ(C556300Lro c556300Lro, Object obj, Object obj2) {
                String str4;
                if (obj2 instanceof C1431390nLt) {
                    C1431390nLt c1431390nLt = (C1431390nLt) obj2;
                    C1431320nLm c1431320nLm = new C1431320nLm(new C543670LTx());
                    C1404570med c1404570med = this.LJ;
                    InterfaceC1434300nQa interfaceC1434300nQa = null;
                    if (c1404570med == null) {
                        c1404570med = null;
                    }
                    c1431320nLm.LIZIZ = c1404570med.LIZ;
                    VideoPublishEditModel videoPublishEditModel = this.LJI;
                    if (videoPublishEditModel == null) {
                        videoPublishEditModel = null;
                    }
                    c1431320nLm.LIZJ = videoPublishEditModel;
                    c1431320nLm.LIZLLL = c1431390nLt.LIZ;
                    c1431320nLm.LJ = EnumC1404580mee.VIDEO;
                    c1431320nLm.LIZ();
                    PublishModel publishModel = this.LJFF;
                    if (publishModel == null) {
                        publishModel = null;
                    }
                    c1431320nLm.LIZLLL(publishModel.LIZJ());
                    c1431320nLm.LIZIZ();
                    c1431320nLm.LJ();
                    C543670LTx c543670LTxLJFF = c1431320nLm.LJFF(EnumC1405140mfY.CALLBACK_TIMEOUT);
                    c543670LTxLJFF.LIZ.put("error_source", c1431390nLt.LIZIZ.getDesc());
                    c543670LTxLJFF.LIZ.put("error_cause", c1431390nLt.LIZJ);
                    C1405220mfg c1405220mfg = this.LJII;
                    if (c1405220mfg == null) {
                        c1405220mfg = null;
                    }
                    if (c1405220mfg.LIZIZ) {
                        str4 = "1";
                    } else {
                        str4 = CardStruct.IStatusCode.DEFAULT;
                    }
                    c543670LTxLJFF.LIZ.put("click_publish", str4);
                    PublishModel publishModel2 = this.LJFF;
                    if (publishModel2 == null) {
                        publishModel2 = null;
                    }
                    c543670LTxLJFF.LIZ.put("is_save_local", Integer.valueOf(publishModel2.isEditSave ? 1 : 0));
                    JSONObject jSONObjectLJ = c543670LTxLJFF.LJ();
                    InterfaceC1434300nQa interfaceC1434300nQa2 = this.LJIIIIZZ;
                    if (interfaceC1434300nQa2 != null) {
                        interfaceC1434300nQa = interfaceC1434300nQa2;
                    }
                    interfaceC1434300nQa.LJI().getClass();
                    C1637890six.LJ("aweme_publish_task_timeout", 0, jSONObjectLJ);
                }
            }
        });
        C1D80 c1d8029 = this.LJI;
        if (c1d8029 == null) {
            c1d8029 = null;
        }
        c1d8029.LIZ(new AbstractC1446660nkW() { // from class: X.0mfH
            public final Object LJ;
            public VideoPublishEditModel LJFF;
            public InterfaceC1434300nQa LJI;

            {
                C1697810uHb.LJIIJJI(EnumC1434770nRL.COMPILE, EnumC1434770nRL.UPLOAD, EnumC1434770nRL.CREATE_AWEME);
                this.LJ = "DefaultWavePublisher";
            }

            @Override // X.AbstractC1446660nkW
            public final void LJ(Object obj, C1404610meh c1404610meh) {
                Iterator<Object> it2 = c1404610meh.LIZ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (next instanceof C1434960nRe) {
                        if (next != null) {
                            this.LJFF = ((C1434960nRe) next).LIZ;
                            Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                Object next2 = it3.next();
                                if (next2 instanceof InterfaceC1434300nQa) {
                                    if (next2 != null) {
                                        InterfaceC1434300nQa interfaceC1434300nQa = (InterfaceC1434300nQa) next2;
                                        this.LJI = interfaceC1434300nQa;
                                        interfaceC1434300nQa.LIZJ();
                                        C1405310mfp.LIZIZ(obj.toString(), "wave task start execute...");
                                        return;
                                    }
                                }
                            }
                            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.publisherbuilder.ITaskExternalDependencyFactory");
                        }
                    }
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
            }

            public final void LJI(int i, C1404850mf5 c1404850mf5) {
                int i2;
                long jCurrentTimeMillis = System.currentTimeMillis();
                C01GW c01gw = C1404790mez.LIZ;
                ((Keva) c01gw.getValue()).storeLong("upload_finish_timestamp", jCurrentTimeMillis);
                if (c1404850mf5 != null) {
                    i2 = (int) c1404850mf5.LIZ;
                } else {
                    i2 = 0;
                }
                int i3 = i - i2;
                if (i3 != 0) {
                    VideoPublishEditModel videoPublishEditModel = this.LJFF;
                    if (videoPublishEditModel == null) {
                        videoPublishEditModel = null;
                    }
                    ((Keva) c01gw.getValue()).storeLong("upload_speed", (new C0VSJ(videoPublishEditModel.getRealSynthesisFile()).length() * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) / ((long) i3));
                }
            }

            @Override // X.AbstractC1446660nkW
            public final void LIZIZ(C556300Lro c556300Lro, Object obj, Object obj2) {
                InterfaceC1434300nQa interfaceC1434300nQa = this.LJI;
                if (interfaceC1434300nQa == null) {
                    return;
                }
                if (obj2 instanceof C1405020mfM) {
                    interfaceC1434300nQa.LIZJ();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("setPreUploadEncryptionMode:");
                    C1405020mfM c1405020mfM = (C1405020mfM) obj2;
                    sbLIZ2.append(c1405020mfM.LIZ);
                    sbLIZ2.append(" isAllowMerge:");
                    sbLIZ2.append(c1405020mfM.LIZIZ);
                    C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                if (obj2 instanceof C1405030mfN) {
                    interfaceC1434300nQa.LIZJ();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("merge Mode:");
                    C1405030mfN c1405030mfN = (C1405030mfN) obj2;
                    sbLIZ3.append(c1405030mfN.LIZ);
                    sbLIZ3.append(" isAllowMerge:");
                    sbLIZ3.append(c1405030mfN.LIZIZ);
                    C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                    return;
                }
                if (obj2 instanceof C1405200mfe) {
                    return;
                }
                if (obj2 instanceof C1405040mfO) {
                    interfaceC1434300nQa.LIZJ();
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("smart slice size = ");
                    sbLIZ4.append(((C1405040mfO) obj2).LIZ);
                    C1405310mfp.LIZIZ("UploadSmartSlice", C2188811AlT.LIZIZ(sbLIZ4));
                    return;
                }
                if (obj2 instanceof C1404980mfI) {
                    C1405310mfp c1405310mfpLIZJ = interfaceC1434300nQa.LIZJ();
                    C1404980mfI c1404980mfI = (C1404980mfI) obj2;
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("ConcurrentUploadByFile probeContext:");
                    sbLIZ5.append(c1404980mfI.LIZIZ);
                    sbLIZ5.append(", speed: ");
                    sbLIZ5.append(c1404980mfI.LIZJ);
                    sbLIZ5.append(", speedThreshold: ");
                    sbLIZ5.append(c1404980mfI.LIZLLL);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
                    c1405310mfpLIZJ.getClass();
                    C201955140j.LIZ(strLIZIZ);
                    return;
                }
                if (obj2 instanceof C1405000mfK) {
                    interfaceC1434300nQa.LIZJ();
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("PublishDurationMonitor EncryptionMode:");
                    C1405000mfK c1405000mfK = (C1405000mfK) obj2;
                    sbLIZ6.append(c1405000mfK.LIZ);
                    sbLIZ6.append(" Upload Start:");
                    sbLIZ6.append(c1405000mfK.LIZIZ);
                    C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ6));
                    return;
                }
                if (!(obj2 instanceof C1404990mfJ)) {
                    return;
                }
                interfaceC1434300nQa.LIZJ();
                C1404990mfJ c1404990mfJ = (C1404990mfJ) obj2;
                C1405310mfp.LIZIZ(c1404990mfJ.LIZ, c1404990mfJ.LIZIZ);
            }

            @Override // X.AbstractC1446660nkW
            public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
                LJII(obj, EnumC617770OKx.LLILLJJLI, i, i2, false);
                if (obj == EnumC1434770nRL.UPLOAD) {
                    LJI(i, null);
                }
            }

            @Override // X.AbstractC1446660nkW
            public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) {
                LJII(obj, EnumC617770OKx.LLILZ, i, i2, false);
                InterfaceC1434300nQa interfaceC1434300nQa = null;
                if (Intrinsics.LJFF(obj, this.LJ)) {
                    InterfaceC1434300nQa interfaceC1434300nQa2 = this.LJI;
                    if (interfaceC1434300nQa2 != null) {
                        interfaceC1434300nQa = interfaceC1434300nQa2;
                    }
                    interfaceC1434300nQa.LIZJ();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("PublishFailed, reason: ");
                    sbLIZ2.append(C08KI.LIZ(c1435220nS4));
                    C1405310mfp.LIZIZ("publish", C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
                if (obj != EnumC1434770nRL.UPLOAD) {
                    return;
                }
                LJI(i, null);
            }

            @Override // X.AbstractC1446660nkW
            public final void LJFF(Object obj, Object obj2, boolean z2, int i, int i2) {
                LJII(obj, EnumC617770OKx.LLILLL, i, i2, z2);
                if (obj == EnumC1434770nRL.UPLOAD) {
                    LJI(i, ((C1404470meT) obj2).LIZIZ);
                }
            }

            public final void LJII(Object obj, EnumC617770OKx enumC617770OKx, int i, int i2, boolean z2) {
                InterfaceC1434300nQa interfaceC1434300nQa = this.LJI;
                if (interfaceC1434300nQa == null) {
                    interfaceC1434300nQa = null;
                }
                interfaceC1434300nQa.LIZJ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("stage: ");
                sbLIZ2.append(obj);
                sbLIZ2.append(" succeeded, event: ");
                sbLIZ2.append(enumC617770OKx.LL);
                sbLIZ2.append(", systemDuration: ");
                sbLIZ2.append(i);
                sbLIZ2.append("ms, absoluteDuration: ");
                sbLIZ2.append(i2);
                sbLIZ2.append("ms, isSkip: ");
                sbLIZ2.append(z2);
                C1405310mfp.LIZIZ("publish_duration_monitor", C2188811AlT.LIZIZ(sbLIZ2));
            }
        });
        C1D80 c1d8030 = this.LJI;
        if (c1d8030 == null) {
            c1d8030 = null;
        }
        c1d8030.LIZ(new AbstractC1446660nkW() { // from class: X.0nRE
            public final String LJ = "DefaultWavePublisher";

            @Override // X.AbstractC1446660nkW
            public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
            }

            @Override // X.AbstractC1446660nkW
            public final void LJ(Object obj, C1404610meh c1404610meh) {
                if (Intrinsics.LJFF(obj, this.LJ)) {
                    C1443030nef.LJII().LJIIJJI(2);
                }
            }

            @Override // X.AbstractC1446660nkW
            public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) {
                if (Intrinsics.LJFF(obj, this.LJ)) {
                    C1443030nef.LJII().LJIIJJI(9);
                }
            }

            @Override // X.AbstractC1446660nkW
            public final void LJFF(Object obj, Object obj2, boolean z2, int i, int i2) {
                if (!Intrinsics.LJFF(obj, this.LJ) && obj == EnumC1434770nRL.CREATE_AWEME) {
                    o.LJIILLIIL.LJIIIIZZ();
                    C1443030nef.LJII().LJIIJJI(10);
                }
            }
        });
        C1D80 c1d8031 = this.LJI;
        if (c1d8031 == null) {
            c1d8031 = null;
        }
        c1d8031.LIZ(new AbstractC1446660nkW() { // from class: X.0mny
            @Override // X.AbstractC1446660nkW
            public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
            }

            @Override // X.AbstractC1446660nkW
            public final void LJ(Object obj, C1404610meh c1404610meh) {
            }

            @Override // X.AbstractC1446660nkW
            public final void LJFF(Object obj, Object obj2, boolean z2, int i, int i2) {
            }

            @Override // X.AbstractC1446660nkW
            public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) {
                if (c1435220nS4.getCode() == 777004) {
                    C0CHQ.LIZ().LJIIJJI();
                    Npth.reportBizException("Publisher-TaskRun", c1435220nS4.getT(), c1435220nS4.getMessage(), C2097608Jq.LJ());
                }
            }
        });
        C1D80 c1d8032 = this.LJI;
        if (c1d8032 == null) {
            c1d8032 = null;
        }
        c1d8032.LIZ(new AbstractC1446660nkW() { // from class: X.0nch
            public VideoPublishEditModel LJ;

            @Override // X.AbstractC1446660nkW
            public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
            }

            @Override // X.AbstractC1446660nkW
            public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) {
            }

            {
                EnumC1434770nRL enumC1434770nRL = EnumC1434770nRL.CREATE_AWEME;
            }

            @Override // X.AbstractC1446660nkW
            public final void LJ(Object obj, C1404610meh c1404610meh) {
                Iterator<Object> it2 = c1404610meh.LIZ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (next instanceof C1434960nRe) {
                        if (next != null) {
                            this.LJ = ((C1434960nRe) next).LIZ;
                            return;
                        }
                    }
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
            }

            @Override // X.AbstractC1446660nkW
            public final void LJFF(Object obj, Object obj2, boolean z2, int i, int i2) {
                CreateBaseAwemeResponse createBaseAwemeResponse;
                if (!C545630Lab.LIZ() || this.LJ == null) {
                    return;
                }
                Object obj3 = ((LinkedHashMap) this.LIZIZ).get(EnumC1434770nRL.CREATE_AWEME);
                String str4 = null;
                if (obj3 instanceof CreateAwemeResponse) {
                    createBaseAwemeResponse = (CreateBaseAwemeResponse) obj3;
                } else {
                    createBaseAwemeResponse = null;
                }
                MusicMonitorTaskQueueService musicMonitorTaskQueueService = (MusicMonitorTaskQueueService) ServiceManager.get().getService(MusicMonitorTaskQueueService.class);
                VideoPublishEditModel videoPublishEditModel = this.LJ;
                if (createBaseAwemeResponse != null) {
                    str4 = createBaseAwemeResponse.materialId;
                }
                musicMonitorTaskQueueService.LIZJ(new C571270Mar(videoPublishEditModel, "post", str4, null, 8));
            }
        });
        if (C545300La4.LIZ()) {
            C1D80 c1d8033 = this.LJI;
            if (c1d8033 == null) {
                c1d8033 = null;
            }
            c1d8033.LIZ(new AbstractC1446660nkW() { // from class: X.09Xp
                public VideoPublishEditModel LJ;

                {
                    EnumC1434770nRL enumC1434770nRL = EnumC1434770nRL.CREATE_AWEME;
                }

                @Override // X.AbstractC1446660nkW
                public final void LJ(Object obj, C1404610meh c1404610meh) {
                    Object c098200Yq;
                    String creationId2 = null;
                    try {
                        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            if (next instanceof C1434960nRe) {
                                if (next != null) {
                                    c098200Yq = ((C1434960nRe) next).LIZ;
                                    C189200o6.m2constructorimpl(c098200Yq);
                                }
                            }
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) c098200Yq;
                    this.LJ = videoPublishEditModel;
                    if (videoPublishEditModel != null) {
                        creationId2 = videoPublishEditModel.getCreationId();
                    }
                    C201955140j.LJIILJJIL(C0LX3.LIZIZ, "AIGCWorkflowCleanUp onStart: monitor armed, creationId=" + creationId2);
                }

                @Override // X.AbstractC1446660nkW
                public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
                    String creationId2;
                    VideoPublishEditModel videoPublishEditModel = this.LJ;
                    if (videoPublishEditModel != null) {
                        creationId2 = videoPublishEditModel.getCreationId();
                    } else {
                        creationId2 = null;
                    }
                    C0LX3 c0lx3 = C0LX3.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("AIGCWorkflowCleanUp onCancel: publish cancelled, skip clean-up, creationId=");
                    sbLIZ2.append(creationId2);
                    C201955140j.LJIILJJIL(c0lx3, C2188811AlT.LIZIZ(sbLIZ2));
                }

                @Override // X.AbstractC1446660nkW
                public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) {
                    String creationId2;
                    VideoPublishEditModel videoPublishEditModel = this.LJ;
                    if (videoPublishEditModel != null) {
                        creationId2 = videoPublishEditModel.getCreationId();
                    } else {
                        creationId2 = null;
                    }
                    C0LX3 c0lx3 = C0LX3.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("AIGCWorkflowCleanUp onFailed: publish failed, skip clean-up, creationId=");
                    sbLIZ2.append(creationId2);
                    C201955140j.LJIILJJIL(c0lx3, C2188811AlT.LIZIZ(sbLIZ2));
                }

                @Override // X.AbstractC1446660nkW
                public final void LJFF(Object obj, Object obj2, boolean z2, int i, int i2) {
                    String creationId2;
                    VideoPublishEditModel videoPublishEditModel = this.LJ;
                    if (videoPublishEditModel != null && (creationId2 = videoPublishEditModel.getCreationId()) != null && creationId2.length() != 0) {
                        C0LX3 c0lx3 = C0LX3.LIZIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("AIGCWorkflowCleanUp onSuccess: start cleaning up workflow for creationId=");
                        sbLIZ2.append(creationId2);
                        C201955140j.LJIJI(c0lx3, C2188811AlT.LIZIZ(sbLIZ2));
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2387809Xg(creationId2, null), 3);
                        return;
                    }
                    C201955140j.LJIJI(C0LX3.LIZIZ, "AIGCWorkflowCleanUp onSuccess: creationId is null or empty, skip clean-up");
                }
            });
        }
        C1D80 c1d8034 = this.LJI;
        if (c1d8034 == null) {
            c1d8034 = null;
        }
        c1d8034.LIZ(new AbstractC1446660nkW() { // from class: X.0meW
            public VideoPublishEditModel LJ;

            @Override // X.AbstractC1446660nkW
            public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
            }

            @Override // X.AbstractC1446660nkW
            public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) {
            }

            {
                EnumC1434770nRL enumC1434770nRL = EnumC1434770nRL.CREATE_AWEME;
            }

            @Override // X.AbstractC1446660nkW
            public final void LJ(Object obj, C1404610meh c1404610meh) {
                Iterator<Object> it2 = c1404610meh.LIZ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (next instanceof C1434960nRe) {
                        if (next != null) {
                            this.LJ = ((C1434960nRe) next).LIZ;
                            return;
                        }
                    }
                }
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
            }

            @Override // X.AbstractC1446660nkW
            public final void LJFF(Object obj, Object obj2, boolean z2, int i, int i2) {
                VideoPublishEditModel videoPublishEditModel;
                String str4;
                CommonMobParamModel commonMobParamModel;
                IAVPublishWhiteBoxService iAVPublishWhiteBoxService = (IAVPublishWhiteBoxService) PluggableExtentionKt.pluggableSpi$default(IAVPublishWhiteBoxService.class, false, false, false, 14, null);
                if (iAVPublishWhiteBoxService == null || (videoPublishEditModel = this.LJ) == null) {
                    return;
                }
                CreativeModel creativeModel = videoPublishEditModel.creativeModel;
                if (creativeModel != null && (commonMobParamModel = creativeModel.commonMobModel) != null) {
                    str4 = commonMobParamModel.shootFromViewPanelAwemeId;
                } else {
                    str4 = null;
                }
                iAVPublishWhiteBoxService.recordWhiteBoxCardPublished(str4);
            }
        });
        IPublishGuideDraftService iPublishGuideDraftService = (IPublishGuideDraftService) PluggableExtentionKt.pluggableSpi$default(IPublishGuideDraftService.class, false, false, false, 14, null);
        if (iPublishGuideDraftService != null && iPublishGuideDraftService.LIZ()) {
            C1D80 c1d8035 = this.LJI;
            if (c1d8035 == null) {
                c1d8035 = null;
            }
            c1d8035.LIZ(new AbstractC1446660nkW() { // from class: X.0mei
                public VideoPublishEditModel LJ;

                @Override // X.AbstractC1446660nkW
                public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
                }

                @Override // X.AbstractC1446660nkW
                public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) {
                }

                {
                    EnumC1434770nRL enumC1434770nRL = EnumC1434770nRL.COMPILE;
                }

                @Override // X.AbstractC1446660nkW
                public final void LJ(Object obj, C1404610meh c1404610meh) {
                    Iterator<Object> it2 = c1404610meh.LIZ.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        if (next instanceof C1434960nRe) {
                            if (next != null) {
                                this.LJ = ((C1434960nRe) next).LIZ;
                                return;
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
                }

                @Override // X.AbstractC1446660nkW
                public final void LJFF(Object obj, Object obj2, boolean z2, int i, int i2) {
                    Unit unit;
                    IInternalDraftSizeCalculator iInternalDraftSizeCalculatorLIZIZ;
                    VideoPublishEditModel videoPublishEditModel = this.LJ;
                    if (videoPublishEditModel == null) {
                        return;
                    }
                    if (C1428470nHB.LJJZZI(videoPublishEditModel) || videoPublishEditModel.isFastImport()) {
                        try {
                            IPublishGuideDraftService iPublishGuideDraftService2 = (IPublishGuideDraftService) PluggableExtentionKt.pluggableSpi$default(IPublishGuideDraftService.class, false, false, false, 14, null);
                            if (iPublishGuideDraftService2 != null && (iInternalDraftSizeCalculatorLIZIZ = iPublishGuideDraftService2.LIZIZ()) != null) {
                                iInternalDraftSizeCalculatorLIZIZ.LJFF(videoPublishEditModel);
                                unit = Unit.LIZ;
                            } else {
                                unit = null;
                            }
                            C189200o6.m2constructorimpl(unit);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                    }
                }
            });
        }
        IToolsVQEvaluationService iToolsVQEvaluationService = (IToolsVQEvaluationService) ServiceManager.get().getService(IToolsVQEvaluationService.class);
        if (iToolsVQEvaluationService != null) {
            iToolsVQEvaluationService.LJFF();
        }
        this.LIZ.LJII();
        List listLIZ = C1434530nQx.LIZ();
        ArrayList<C1434540nQy> arrayList2 = new ArrayList();
        for (Object obj : listLIZ) {
            if (((C1434540nQy) obj).LIZ.contains(EnumC1404600meg.DEFAULT)) {
                arrayList2.add(obj);
            }
        }
        for (C1434540nQy c1434540nQy : arrayList2) {
            C1D80 c1d8036 = this.LJI;
            if (c1d8036 == null) {
                c1d8036 = null;
            }
            c1d8036.LIZ(c1434540nQy.LIZIZ);
        }
        this.LIZ.LJII().getClass();
        C13BV c13bv = C13BV.INSTANCE;
        ArrayList<C1434540nQy> arrayList3 = new ArrayList();
        for (Object obj2 : c13bv) {
            if (((C1434540nQy) obj2).LIZ.contains(EnumC1404600meg.DEFAULT)) {
                arrayList3.add(obj2);
            }
        }
        for (C1434540nQy c1434540nQy2 : arrayList3) {
            C1D80 c1d8037 = this.LJI;
            if (c1d8037 == null) {
                c1d8037 = null;
            }
            c1d8037.LIZ(c1434540nQy2.LIZIZ);
        }
        if (((Boolean) C262620AQy.LIZ.getValue()).booleanValue()) {
            C1D80 c1d8038 = this.LJI;
            if (c1d8038 != null) {
                c1d802 = c1d8038;
            }
            c1d802.LIZ(new C2208891Bcl());
        }
    }

    public final void LJ(EnumC1405170mfb enumC1405170mfb) {
        IPublishServiceFactory iPublishServiceFactory;
        boolean zLJI = MethodIDManager.LJI(72062);
        C1D80 c1d80 = null;
        if (this.LIZJ.LIZ.publishType == 0) {
            this.LJIIIZ.LIZ = (VideoPublishEditModel) this.LIZJ.LIZ.editModel;
            this.LJIIJ.LIZ = this.LIZJ.LIZ;
            if (enumC1405170mfb != null) {
                this.LJIIJ.LIZ.retryType = enumC1405170mfb;
            }
            ((C1405220mfg) this.LJII.getValue()).LIZLLL(EnumC1404590mef.DEFAULT);
            C1433730nPf.LIZ(this.LIZJ.LIZIZ, new C1433340nP2(o.LJIILJJIL.LJFF(this.LJIIJ.LIZ, this.LIZJ.LIZIZ)));
            PublishProgressDialogAddHelper publishProgressDialogAddHelper = PublishProgressDialogAddHelper.LIZ;
            String str = this.LIZJ.LIZIZ;
            publishProgressDialogAddHelper.getClass();
            PublishProgressDialogAddHelper.LIZJ(str);
            C1D80 c1d802 = this.LJI;
            if (c1d802 == null) {
                c1d802 = null;
            }
            if (c1d802.LIZJ().LIZIZ) {
                C1D80 c1d803 = this.LJI;
                if (c1d803 == null) {
                    c1d803 = null;
                }
                PublishModel publishModel = this.LJIIJ.LIZ;
                EnumC2251001D8o enumC2251001D8o = EnumC2251001D8o.ALL;
                c1d803.getClass();
                c1d803.LJFF(new AwS129S0400000_35(c1d803, publishModel, enumC2251001D8o, new C556300Lro(0), 0));
            }
            Object objLIZ = C04TD.LIZ(IPublishServiceFactory.class, false);
            if (objLIZ != null) {
                iPublishServiceFactory = (IPublishServiceFactory) objLIZ;
            } else {
                if (C04TD.f5 == null) {
                    synchronized (IPublishServiceFactory.class) {
                        if (C04TD.f5 == null) {
                            C04TD.f5 = new PublishServiceFactoryImpl();
                        }
                    }
                }
                iPublishServiceFactory = C04TD.f5;
            }
            C1433340nP2 c1433340nP2 = new C1433340nP2(iPublishServiceFactory.LIZ(this.LIZJ.LIZ.videoType, this.LIZJ.LIZ.editModel));
            C1433730nPf c1433730nPf = C1433730nPf.LIZ;
            String str2 = this.LIZJ.LIZIZ;
            c1433730nPf.getClass();
            C1433730nPf.LIZIZ(str2, c1433340nP2);
            this.LJIILIIL = c1433340nP2;
            C0CHQ.LIZ().getPublishService().LJIIL();
            C1436830nUf.LJIL(this.LIZJ.LIZ);
        }
        C1D80 c1d804 = this.LJI;
        if (c1d804 != null) {
            c1d80 = c1d804;
        }
        c1d80.LJII();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC1433580nPQ
    public final void LJIILL(C1433230nOr c1433230nOr) {
        EnableParallelPublishSchedulerV2Exp.Config configLIZ = EnableParallelPublishSchedulerV2Exp.LIZ();
        if (configLIZ.enable && configLIZ.watermarkDetachEnable) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[DefaultWavePublisher] cancel watermark by publishId=");
            sbLIZ.append(this.LIZLLL);
            sbLIZ.append(" cause=");
            sbLIZ.append(c1433230nOr.LIZ);
            C201955140j.LIZIZ("DetachWaterMark", C2188811AlT.LIZIZ(sbLIZ));
            C1435440nSQ c1435440nSQ = C1435440nSQ.LIZ;
            String str = this.LIZLLL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("DefaultWavePublisher.cancel: ");
            sbLIZ2.append(c1433230nOr.LIZ);
            c1435440nSQ.LIZ(str, C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (this.LJI != null) {
            C1D80 c1d80 = this.LJI;
            if (c1d80 == null) {
                c1d80 = null;
            }
            c1d80.LIZIZ(c1433230nOr);
        }
    }

    @Override // X.InterfaceC1433580nPQ
    public final void LJIIZILJ(AbstractC1433570nPP abstractC1433570nPP) {
        this.LJIIIIZZ = abstractC1433570nPP;
        LIZJ(null);
        LJ(null);
    }

    public final void LIZIZ(int i, C1434900nRY c1434900nRY) {
        if (!((Boolean) C262620AQy.LIZ.getValue()).booleanValue()) {
            return;
        }
        if (((Boolean) C262630AQz.LIZ.getValue()).booleanValue() && c1434900nRY.LJ) {
            i = c1434900nRY.LJFF;
        }
        Iterator<InterfaceC1435360nSI> it2 = ((C1434910nRZ) this.LJIIZILJ.getValue()).LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().onProgressChanged(i);
        }
    }

    public C1434730nRH(C1433530nPL c1433530nPL, String str, C1430790nKv c1430790nKv, C1434310nQb c1434310nQb) {
        super(c1434310nQb);
        this.LIZJ = c1433530nPL;
        this.LIZLLL = str;
        this.LJ = c1430790nKv;
        this.LJFF = c1434310nQb;
        this.LJII = C452501pT.LIZIZ(new AwS566S0100000_22(this, 964));
        this.LJIIIZ = new C1434960nRe((VideoPublishEditModel) c1433530nPL.LIZ.editModel);
        this.LJIIJ = new C1434970nRf(c1433530nPL.LIZ);
        this.LJIILL = (PublishPatienceConfig) C1434980nRg.LIZIZ.getValue();
        this.LJIILLIIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 969));
        this.LJIIZILJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(394));
        this.LJIJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(395));
        this.LJIJI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 968));
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null) {
            creativeToolsPluginService.LIZ();
        }
    }
}
