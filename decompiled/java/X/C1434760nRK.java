package X;

import com.ss.android.ugc.aweme.service.ICreativeSocialBridgeService;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS636S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nRK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1434760nRK implements InterfaceC1433580nPQ {
    public final C1433530nPL LIZ;
    public final C1430790nKv LIZIZ;
    public final InterfaceC1434300nQa LIZJ;
    public volatile C1D80 LIZLLL;
    public final C1434970nRf LJ;
    public final C1434960nRe LJFF;
    public AbstractC1433570nPP LJI;
    public final C01GW LJII = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(550));

    @Override // X.InterfaceC1433580nPQ
    public final void LJI() {
    }

    @Override // X.InterfaceC1433580nPQ
    public final boolean LJIILLIIL() {
        return false;
    }

    @Override // X.InterfaceC1433580nPQ
    public final boolean LJIJ() {
        return true;
    }

    @Override // X.InterfaceC1433580nPQ
    public final void reStart() {
        C1D80 c1d80 = this.LIZLLL;
        if (c1d80 == null) {
            c1d80 = null;
        }
        c1d80.LJII();
    }

    @Override // X.InterfaceC1433580nPQ
    public final void LJIILL(C1433230nOr c1433230nOr) {
        if (this.LIZLLL != null) {
            C1D80 c1d80 = this.LIZLLL;
            if (c1d80 == null) {
                c1d80 = null;
            }
            c1d80.LIZIZ(c1433230nOr);
        }
    }

    @Override // X.InterfaceC1433580nPQ
    public final void LJIIZILJ(AbstractC1433570nPP abstractC1433570nPP) {
        this.LJI = abstractC1433570nPP;
        ICreativeSocialBridgeService iCreativeSocialBridgeService = (ICreativeSocialBridgeService) this.LJII.getValue();
        C1D80 c1d80 = null;
        if (iCreativeSocialBridgeService != null) {
            C1D82 c1d82 = new C1D82(new AwS566S0100000_22(iCreativeSocialBridgeService, 1136), EnumC1434770nRL.AUTH_KEY);
            C1D82 c1d822 = new C1D82(AFwS210S0000000_22.get$arr$(552), EnumC1434770nRL.COVER_TEXT_UPLOAD);
            C1D82 c1d823 = new C1D82(AFwS210S0000000_22.get$arr$(554), EnumC1434770nRL.STORY_THOUGHT_AVATAR_UPLOAD);
            C1D82 c1d824 = new C1D82(AFwS210S0000000_22.get$arr$(551), EnumC1434770nRL.STORY_THOUGHT_UPLOAD);
            C1D82 c1d825 = new C1D82(AFwS210S0000000_22.get$arr$(553), EnumC1434770nRL.CREATE_AWEME);
            c1d822.LIZ(c1d82);
            c1d823.LIZ(c1d82);
            c1d824.LIZ(c1d82);
            c1d825.LIZ(c1d82, c1d822, c1d823, c1d824);
            C1440550naf c1440550naf = new C1440550naf("StoryNoteWavePublisher", (C1D82[]) Arrays.copyOf(new C1D82[]{c1d82}, 1));
            c1440550naf.LIZIZ = this.LIZ.LIZIZ;
            ArrayList arrayList = (ArrayList) c1440550naf.LIZLLL;
            arrayList.add(this.LJ);
            arrayList.add(this.LJFF);
            arrayList.add(new C1404570med(this.LIZ.LIZIZ));
            arrayList.add(this.LIZIZ);
            arrayList.add(this.LIZJ);
            this.LIZJ.LJFF();
            c1440550naf.LJII = new C1435280nSA(C1434840nRS.LIZLLL(this.LIZ));
            this.LIZJ.LJFF();
            c1440550naf.LJIIIIZZ = new C1435280nSA(C1434840nRS.LJ());
            this.LIZJ.LJFF();
            c1440550naf.LJIIIZ = new C1435280nSA(C1434840nRS.LIZJ());
            this.LIZLLL = c1440550naf.LIZ();
            C1D80 c1d802 = this.LIZLLL;
            if (c1d802 == null) {
                c1d802 = null;
            }
            c1d802.LIZ(new AbstractC1446660nkW() { // from class: X.0meP
                public final String LJ;
                public VideoPublishEditModel LJFF;
                public C1404570med LJI;
                public PublishModel LJII;
                public InterfaceC1434300nQa LJIIIIZZ;
                public boolean LJIIIZ;
                public final C01GW LJIIJ;
                public boolean LJIIJJI;

                {
                    C1697810uHb.LJIIJJI(EnumC1434770nRL.COMPILE, EnumC1434770nRL.UPLOAD, EnumC1434770nRL.CREATE_AWEME);
                    this.LJ = "StoryNoteWavePublisher";
                    this.LJIIJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(549));
                }

                public final ICreativeSocialBridgeService LJII() {
                    return (ICreativeSocialBridgeService) this.LJIIJ.getValue();
                }

                /* JADX WARN: Removed duplicated region for block: B:101:0x01fb  */
                /* JADX WARN: Removed duplicated region for block: B:104:0x0209  */
                /* JADX WARN: Removed duplicated region for block: B:107:0x0217  */
                /* JADX WARN: Removed duplicated region for block: B:110:0x021e  */
                /* JADX WARN: Removed duplicated region for block: B:113:0x022b  */
                /* JADX WARN: Removed duplicated region for block: B:121:0x0242  */
                /* JADX WARN: Removed duplicated region for block: B:124:0x0250  */
                /* JADX WARN: Removed duplicated region for block: B:127:0x0268  */
                /* JADX WARN: Removed duplicated region for block: B:130:0x0276  */
                /* JADX WARN: Removed duplicated region for block: B:133:0x0284  */
                /* JADX WARN: Removed duplicated region for block: B:136:0x0292  */
                /* JADX WARN: Removed duplicated region for block: B:139:0x02a8  */
                /* JADX WARN: Removed duplicated region for block: B:142:0x02ba  */
                /* JADX WARN: Removed duplicated region for block: B:145:0x02ca  */
                /* JADX WARN: Removed duplicated region for block: B:153:0x02e5  */
                /* JADX WARN: Removed duplicated region for block: B:156:0x02f7  */
                /* JADX WARN: Removed duplicated region for block: B:159:0x0313  */
                /* JADX WARN: Removed duplicated region for block: B:162:0x0331  */
                /* JADX WARN: Removed duplicated region for block: B:165:0x0338  */
                /* JADX WARN: Removed duplicated region for block: B:168:0x033f  */
                /* JADX WARN: Removed duplicated region for block: B:171:0x0355  */
                /* JADX WARN: Removed duplicated region for block: B:174:0x0360  */
                /* JADX WARN: Removed duplicated region for block: B:177:0x037f  */
                /* JADX WARN: Removed duplicated region for block: B:183:0x038b  */
                /* JADX WARN: Removed duplicated region for block: B:186:0x0393  */
                /* JADX WARN: Removed duplicated region for block: B:196:0x03af  */
                /* JADX WARN: Removed duplicated region for block: B:199:0x03bc  */
                /* JADX WARN: Removed duplicated region for block: B:205:0x03d9  */
                /* JADX WARN: Removed duplicated region for block: B:208:0x03e7  */
                /* JADX WARN: Removed duplicated region for block: B:216:0x040f  */
                /* JADX WARN: Removed duplicated region for block: B:223:0x0445  */
                /* JADX WARN: Removed duplicated region for block: B:239:0x04d3  */
                /* JADX WARN: Removed duplicated region for block: B:242:0x04e3  */
                /* JADX WARN: Removed duplicated region for block: B:245:0x04fb  */
                /* JADX WARN: Removed duplicated region for block: B:248:0x0526  */
                /* JADX WARN: Removed duplicated region for block: B:251:0x052f  */
                /* JADX WARN: Removed duplicated region for block: B:268:0x056f  */
                /* JADX WARN: Removed duplicated region for block: B:271:0x0578  */
                /* JADX WARN: Removed duplicated region for block: B:274:0x058a  */
                /* JADX WARN: Removed duplicated region for block: B:277:0x0598  */
                /* JADX WARN: Removed duplicated region for block: B:280:0x05ae  */
                /* JADX WARN: Removed duplicated region for block: B:286:0x05c6  */
                /* JADX WARN: Removed duplicated region for block: B:292:0x05d8  */
                /* JADX WARN: Removed duplicated region for block: B:302:0x0605  */
                /* JADX WARN: Removed duplicated region for block: B:305:0x0613  */
                /* JADX WARN: Removed duplicated region for block: B:308:0x0623  */
                /* JADX WARN: Removed duplicated region for block: B:311:0x062a  */
                /* JADX WARN: Removed duplicated region for block: B:317:0x0650  */
                /* JADX WARN: Removed duplicated region for block: B:320:0x0657  */
                /* JADX WARN: Removed duplicated region for block: B:325:0x0681  */
                /* JADX WARN: Removed duplicated region for block: B:328:0x0693  */
                /* JADX WARN: Removed duplicated region for block: B:331:0x069a  */
                /* JADX WARN: Removed duplicated region for block: B:344:0x06ca  */
                /* JADX WARN: Removed duplicated region for block: B:347:0x06d5  */
                /* JADX WARN: Removed duplicated region for block: B:355:0x06fa  */
                /* JADX WARN: Removed duplicated region for block: B:358:0x0701  */
                /* JADX WARN: Removed duplicated region for block: B:361:0x070b  */
                /* JADX WARN: Removed duplicated region for block: B:369:0x0721  */
                /* JADX WARN: Removed duplicated region for block: B:372:0x0729  */
                /* JADX WARN: Removed duplicated region for block: B:375:0x0732  */
                /* JADX WARN: Removed duplicated region for block: B:385:0x0756  */
                /* JADX WARN: Removed duplicated region for block: B:388:0x0768  */
                /* JADX WARN: Removed duplicated region for block: B:391:0x076f  */
                /* JADX WARN: Removed duplicated region for block: B:394:0x077a  */
                /* JADX WARN: Removed duplicated region for block: B:397:0x0788  */
                /* JADX WARN: Removed duplicated region for block: B:400:0x0798  */
                /* JADX WARN: Removed duplicated region for block: B:403:0x079f  */
                /* JADX WARN: Removed duplicated region for block: B:406:0x07aa  */
                /* JADX WARN: Removed duplicated region for block: B:409:0x07b1  */
                /* JADX WARN: Removed duplicated region for block: B:412:0x07bc  */
                /* JADX WARN: Removed duplicated region for block: B:415:0x07d1  */
                /* JADX WARN: Removed duplicated region for block: B:418:0x07de  */
                /* JADX WARN: Removed duplicated region for block: B:421:0x07eb  */
                /* JADX WARN: Removed duplicated region for block: B:437:0x081a  */
                /* JADX WARN: Removed duplicated region for block: B:440:0x0821  */
                /* JADX WARN: Removed duplicated region for block: B:443:0x082f  */
                /* JADX WARN: Removed duplicated region for block: B:446:0x0834  */
                /* JADX WARN: Removed duplicated region for block: B:449:0x0845  */
                /* JADX WARN: Removed duplicated region for block: B:452:0x0855  */
                /* JADX WARN: Removed duplicated region for block: B:455:0x0872  */
                /* JADX WARN: Removed duplicated region for block: B:458:0x087c  */
                /* JADX WARN: Removed duplicated region for block: B:462:0x0895  */
                /* JADX WARN: Removed duplicated region for block: B:465:0x08ac  */
                /* JADX WARN: Removed duplicated region for block: B:486:0x08e2  */
                /* JADX WARN: Removed duplicated region for block: B:487:0x08e5  */
                /* JADX WARN: Removed duplicated region for block: B:488:0x08e8  */
                /* JADX WARN: Removed duplicated region for block: B:489:0x08eb  */
                /* JADX WARN: Removed duplicated region for block: B:496:0x0903  */
                /* JADX WARN: Removed duplicated region for block: B:497:0x090b  */
                /* JADX WARN: Removed duplicated region for block: B:499:0x0911  */
                /* JADX WARN: Removed duplicated region for block: B:504:0x091f  */
                /* JADX WARN: Removed duplicated region for block: B:508:0x092a  */
                /* JADX WARN: Removed duplicated region for block: B:509:0x092d  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x00f9  */
                /* JADX WARN: Removed duplicated region for block: B:510:0x0930  */
                /* JADX WARN: Removed duplicated region for block: B:511:0x0933  */
                /* JADX WARN: Removed duplicated region for block: B:514:0x093d  */
                /* JADX WARN: Removed duplicated region for block: B:522:0x0960  */
                /* JADX WARN: Removed duplicated region for block: B:523:0x0966  */
                /* JADX WARN: Removed duplicated region for block: B:524:0x096c  */
                /* JADX WARN: Removed duplicated region for block: B:525:0x096f  */
                /* JADX WARN: Removed duplicated region for block: B:526:0x0972  */
                /* JADX WARN: Removed duplicated region for block: B:527:0x0975  */
                /* JADX WARN: Removed duplicated region for block: B:528:0x0978  */
                /* JADX WARN: Removed duplicated region for block: B:529:0x097c  */
                /* JADX WARN: Removed duplicated region for block: B:530:0x097f  */
                /* JADX WARN: Removed duplicated region for block: B:531:0x0982  */
                /* JADX WARN: Removed duplicated region for block: B:532:0x0985  */
                /* JADX WARN: Removed duplicated region for block: B:534:0x098c  */
                /* JADX WARN: Removed duplicated region for block: B:535:0x098f  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x0106  */
                /* JADX WARN: Removed duplicated region for block: B:553:0x09d1 A[LOOP:1: B:551:0x09cb->B:553:0x09d1, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:556:0x09e3  */
                /* JADX WARN: Removed duplicated region for block: B:560:0x09fd A[LOOP:2: B:558:0x09f7->B:560:0x09fd, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:563:0x0a17  */
                /* JADX WARN: Removed duplicated region for block: B:567:0x0a31 A[LOOP:3: B:565:0x0a2b->B:567:0x0a31, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:56:0x0118  */
                /* JADX WARN: Removed duplicated region for block: B:571:0x0a90  */
                /* JADX WARN: Removed duplicated region for block: B:584:0x0ae1  */
                /* JADX WARN: Removed duplicated region for block: B:589:0x0b17  */
                /* JADX WARN: Removed duplicated region for block: B:592:0x0b24  */
                /* JADX WARN: Removed duplicated region for block: B:595:0x0b2c  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x013c  */
                /* JADX WARN: Removed duplicated region for block: B:608:0x0b6b  */
                /* JADX WARN: Removed duplicated region for block: B:611:0x0b7c  */
                /* JADX WARN: Removed duplicated region for block: B:614:0x0b88  */
                /* JADX WARN: Removed duplicated region for block: B:617:0x0b90  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x0147  */
                /* JADX WARN: Removed duplicated region for block: B:639:0x0c05  */
                /* JADX WARN: Removed duplicated region for block: B:656:0x0c39  */
                /* JADX WARN: Removed duplicated region for block: B:659:0x0c44  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x0155  */
                /* JADX WARN: Removed duplicated region for block: B:667:0x0c5d  */
                /* JADX WARN: Removed duplicated region for block: B:670:0x0c66  */
                /* JADX WARN: Removed duplicated region for block: B:673:0x0c6c A[PHI: r3 r5
                  0x0c6c: PHI (r3v126 boolean) = (r3v107 boolean), (r3v127 boolean) binds: [B:726:0x0d0b, B:672:0x0c6b] A[DONT_GENERATE, DONT_INLINE]
                  0x0c6c: PHI (r5v6 boolean) = (r5v3 boolean), (r5v7 boolean) binds: [B:726:0x0d0b, B:672:0x0c6b] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:675:0x0c70  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x0168  */
                /* JADX WARN: Removed duplicated region for block: B:695:0x0ca9  */
                /* JADX WARN: Removed duplicated region for block: B:698:0x0cb1  */
                /* JADX WARN: Removed duplicated region for block: B:710:0x0cd9  */
                /* JADX WARN: Removed duplicated region for block: B:713:0x0ceb  */
                /* JADX WARN: Removed duplicated region for block: B:716:0x0cf5  */
                /* JADX WARN: Removed duplicated region for block: B:719:0x0cfe  */
                /* JADX WARN: Removed duplicated region for block: B:720:0x0d00  */
                /* JADX WARN: Removed duplicated region for block: B:721:0x0d02  */
                /* JADX WARN: Removed duplicated region for block: B:722:0x0d04  */
                /* JADX WARN: Removed duplicated region for block: B:723:0x0d06  */
                /* JADX WARN: Removed duplicated region for block: B:724:0x0d09  */
                /* JADX WARN: Removed duplicated region for block: B:728:0x0d0f A[PHI: r3 r5
                  0x0d0f: PHI (r3v108 boolean) = (r3v107 boolean), (r3v126 boolean) binds: [B:726:0x0d0b, B:674:0x0c6e] A[DONT_GENERATE, DONT_INLINE]
                  0x0d0f: PHI (r5v4 boolean) = (r5v3 boolean), (r5v6 boolean) binds: [B:726:0x0d0b, B:674:0x0c6e] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:729:0x0d12  */
                /* JADX WARN: Removed duplicated region for block: B:730:0x0d16  */
                /* JADX WARN: Removed duplicated region for block: B:731:0x0d19  */
                /* JADX WARN: Removed duplicated region for block: B:732:0x0d1d  */
                /* JADX WARN: Removed duplicated region for block: B:733:0x0d20  */
                /* JADX WARN: Removed duplicated region for block: B:736:0x0d28  */
                /* JADX WARN: Removed duplicated region for block: B:77:0x018b  */
                /* JADX WARN: Removed duplicated region for block: B:80:0x019f  */
                /* JADX WARN: Removed duplicated region for block: B:83:0x01aa  */
                /* JADX WARN: Removed duplicated region for block: B:86:0x01b5  */
                /* JADX WARN: Removed duplicated region for block: B:89:0x01c0  */
                /* JADX WARN: Removed duplicated region for block: B:92:0x01cd  */
                /* JADX WARN: Removed duplicated region for block: B:98:0x01e9  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LJIIIZ() {
                    /*
                        Method dump skipped, instruction units count: 3406
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1404430meP.LJIIIZ():void");
                }

                public final C0LAB LJIIJ() {
                    ICreativeSocialBridgeService iCreativeSocialBridgeServiceLJII = LJII();
                    if (iCreativeSocialBridgeServiceLJII == null) {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    C1404570med c1404570med = this.LJI;
                    if (c1404570med == null) {
                        c1404570med = null;
                    }
                    String str = c1404570med.LIZ;
                    VideoPublishEditModel videoPublishEditModel = this.LJFF;
                    return iCreativeSocialBridgeServiceLJII.LJJIIZI(videoPublishEditModel != null ? videoPublishEditModel : null, str);
                }

                public static final String LJIIIIZZ(VideoPublishEditModel videoPublishEditModel) {
                    String strLJII;
                    int i;
                    if (C123100dR.LIZ(videoPublishEditModel.creativeModel.commonMobModel.fromGroupId)) {
                        strLJII = videoPublishEditModel.creativeModel.commonMobModel.fromGroupId;
                        i = 1;
                    } else {
                        strLJII = C1443560nfW.LJII();
                        i = 2;
                    }
                    C0LAB c0lab = new C0LAB();
                    c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
                    c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
                    c0lab.LIZ(1, "story_note");
                    c0lab.LJ("from_group_id", strLJII);
                    c0lab.LIZ(i, "get_method");
                    C20684815ws.LJIILLIIL("publish_finish_from_group_id", c0lab.LIZ);
                    return strLJII;
                }

                @Override // X.AbstractC1446660nkW, X.InterfaceC1840230xzJ
                public void onEvent(AbstractC556190Lrd abstractC556190Lrd) {
                    super.onEvent(abstractC556190Lrd);
                    Object obj = abstractC556190Lrd.LIZ;
                    if (obj == EnumC1434770nRL.UPLOAD) {
                        boolean z = abstractC556190Lrd instanceof C556240Lri;
                    } else {
                        if (obj != EnumC1434770nRL.CREATE_AWEME || !(abstractC556190Lrd instanceof C556250Lrj) || !((Boolean) C280500Az2.LIZ.getValue()).booleanValue()) {
                            return;
                        }
                        LJIIIZ();
                    }
                }

                public static final void LJI(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
                    String str = "";
                    String strLJJ = C1428470nHB.LJJ(videoPublishEditModel, "");
                    c0lab.LJ("followed_template_type", videoPublishEditModel.creativeModel.followUpPublishTrackerModel.followedTemplateType);
                    c0lab.LJ("followed_item_id", strLJJ);
                    if (C1428470nHB.LLIIJI(videoPublishEditModel) || Intrinsics.LJFF(videoPublishEditModel.mShootWay, "autocut_anchor")) {
                        if (C1428470nHB.LLIIJI(videoPublishEditModel)) {
                            String str2 = videoPublishEditModel.creativeModel.ugcTemplateData.ugcTemplateId;
                            if (str2 == null) {
                                str2 = "";
                            }
                            c0lab.LJ("followed_template_id", str2);
                        }
                        if (Intrinsics.LJFF(videoPublishEditModel.mShootWay, "autocut_anchor")) {
                            String str3 = videoPublishEditModel.creativeModel.autoCutAnchorModel.templateId;
                            if (str3 != null) {
                                str = str3;
                            }
                            c0lab.LJ("followed_template_id", str);
                        }
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
                                this.LJFF = ((C1434960nRe) next).LIZ;
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
                                                if (next3 instanceof C1404570med) {
                                                    if (next3 != null) {
                                                        this.LJI = (C1404570med) next3;
                                                        Iterator<Object> it5 = c1404610meh.LIZ.iterator();
                                                        while (true) {
                                                            if (!it5.hasNext()) {
                                                                break;
                                                            }
                                                            Object next4 = it5.next();
                                                            if (next4 instanceof InterfaceC1434300nQa) {
                                                                if (next4 != null) {
                                                                    this.LJIIIIZZ = (InterfaceC1434300nQa) next4;
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
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
                }

                @Override // X.AbstractC1446660nkW
                public final void LIZIZ(C556300Lro c556300Lro, Object obj, Object obj2) {
                    if (obj2 instanceof C556260Lrk) {
                        Object obj3 = ((C556260Lrk) obj2).LIZ;
                        if (obj3 instanceof PublishModel) {
                            this.LJII = (PublishModel) obj3;
                        }
                    }
                }

                @Override // X.AbstractC1446660nkW
                public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
                    int i3;
                    String string;
                    C0LAB c0labLJIIJ = LJIIJ();
                    VideoPublishEditModel videoPublishEditModel = this.LJFF;
                    VideoPublishEditModel videoPublishEditModel2 = null;
                    if (videoPublishEditModel == null) {
                        videoPublishEditModel = null;
                    }
                    c0labLJIIJ.LJ("shoot_way", videoPublishEditModel.mShootWay);
                    VideoPublishEditModel videoPublishEditModel3 = this.LJFF;
                    if (videoPublishEditModel3 == null) {
                        videoPublishEditModel3 = null;
                    }
                    c0labLJIIJ.LIZ(videoPublishEditModel3.isOpenForegroundPublish() ? 1 : 0, "is_open_foreground");
                    VideoPublishEditModel videoPublishEditModel4 = this.LJFF;
                    if (videoPublishEditModel4 == null) {
                        videoPublishEditModel4 = null;
                    }
                    c0labLJIIJ.LIZ(videoPublishEditModel4.isBackgroundPublish() ? 1 : 0, "is_background_publish");
                    VideoPublishEditModel videoPublishEditModel5 = this.LJFF;
                    if (videoPublishEditModel5 == null) {
                        videoPublishEditModel5 = null;
                    }
                    int i4 = 1;
                    if (videoPublishEditModel5.getTtStoryUploadModel() != null) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    c0labLJIIJ.LIZ(i3, "is_story");
                    VideoPublishEditModel videoPublishEditModel6 = this.LJFF;
                    if (videoPublishEditModel6 == null) {
                        videoPublishEditModel6 = null;
                    }
                    c0labLJIIJ.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel6));
                    VideoPublishEditModel videoPublishEditModel7 = this.LJFF;
                    if (videoPublishEditModel7 == null) {
                        videoPublishEditModel7 = null;
                    }
                    Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel7);
                    int iIntValue = pairLJIIJJI.getFirst().intValue();
                    int iIntValue2 = pairLJIIJJI.getSecond().intValue();
                    c0labLJIIJ.LIZ(iIntValue2, "pic_cnt");
                    c0labLJIIJ.LJ("mix_type", C560460LyW.LIZ(iIntValue, iIntValue2));
                    boolean z = abstractC1404540mea instanceof C1404560mec;
                    if (z) {
                        Object obj2 = ((C1404560mec) abstractC1404540mea).LIZ;
                        if (obj2 != null) {
                            string = obj2.toString();
                        } else {
                            string = null;
                        }
                        c0labLJIIJ.LJ("cancel_reason", string);
                    } else if (abstractC1404540mea instanceof C1404550meb) {
                        c0labLJIIJ.LIZ(((C1404550meb) abstractC1404540mea).LIZ.getCode(), "error_code");
                    }
                    PublishModel publishModel = this.LJII;
                    if (publishModel == null) {
                        publishModel = null;
                    }
                    if (publishModel.retryType == EnumC1405170mfb.NOT_RETRY) {
                        i4 = 0;
                    }
                    c0labLJIIJ.LIZ(i4, "is_retry");
                    Map<String, String> map = c0labLJIIJ.LIZ;
                    InterfaceC1434300nQa interfaceC1434300nQa = this.LJIIIIZZ;
                    if (interfaceC1434300nQa == null) {
                        interfaceC1434300nQa = null;
                    }
                    interfaceC1434300nQa.LJ().getClass();
                    C20684815ws.LJIILLIIL("publish_cancel", map);
                    VideoPublishEditModel videoPublishEditModel8 = this.LJFF;
                    if (videoPublishEditModel8 == null) {
                        videoPublishEditModel8 = null;
                    }
                    String creationId = videoPublishEditModel8.getCreationId();
                    VideoPublishEditModel videoPublishEditModel9 = this.LJFF;
                    if (videoPublishEditModel9 == null) {
                        videoPublishEditModel9 = null;
                    }
                    C1457570o27.LJ(creationId, "video_post_page", "publish_cancel", videoPublishEditModel9.hasMusic());
                    if (z) {
                        Object obj3 = ((C1404560mec) abstractC1404540mea).LIZ;
                        if (obj3 instanceof C1433230nOr) {
                            C0CHQ.LIZ().getPublishService().LJJJLL();
                            VideoPublishEditModel videoPublishEditModel10 = this.LJFF;
                            if (videoPublishEditModel10 != null) {
                                videoPublishEditModel2 = videoPublishEditModel10;
                            }
                            C1431870nMf.LJIIIZ(videoPublishEditModel2, ((C1433230nOr) obj3).LIZ);
                        }
                    }
                }

                @Override // X.AbstractC1446660nkW
                public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) {
                    int i3;
                    C0LAB c0labLJIIJ = LJIIJ();
                    VideoPublishEditModel videoPublishEditModel = this.LJFF;
                    VideoPublishEditModel videoPublishEditModel2 = null;
                    if (videoPublishEditModel == null) {
                        videoPublishEditModel = null;
                    }
                    c0labLJIIJ.LJ("shoot_way", videoPublishEditModel.mShootWay);
                    VideoPublishEditModel videoPublishEditModel3 = this.LJFF;
                    if (videoPublishEditModel3 == null) {
                        videoPublishEditModel3 = null;
                    }
                    c0labLJIIJ.LIZ(videoPublishEditModel3.isOpenForegroundPublish() ? 1 : 0, "is_open_foreground");
                    VideoPublishEditModel videoPublishEditModel4 = this.LJFF;
                    if (videoPublishEditModel4 == null) {
                        videoPublishEditModel4 = null;
                    }
                    c0labLJIIJ.LIZ(videoPublishEditModel4.isBackgroundPublish() ? 1 : 0, "is_background_publish");
                    VideoPublishEditModel videoPublishEditModel5 = this.LJFF;
                    if (videoPublishEditModel5 == null) {
                        videoPublishEditModel5 = null;
                    }
                    int i4 = 1;
                    if (videoPublishEditModel5.getTtStoryUploadModel() != null) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    c0labLJIIJ.LIZ(i3, "is_story");
                    c0labLJIIJ.LIZ(c1435220nS4.getCode(), "error_code");
                    VideoPublishEditModel videoPublishEditModel6 = this.LJFF;
                    if (videoPublishEditModel6 == null) {
                        videoPublishEditModel6 = null;
                    }
                    c0labLJIIJ.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel6));
                    VideoPublishEditModel videoPublishEditModel7 = this.LJFF;
                    if (videoPublishEditModel7 == null) {
                        videoPublishEditModel7 = null;
                    }
                    c0labLJIIJ.LJ("creation_id", videoPublishEditModel7.getCreationId());
                    VideoPublishEditModel videoPublishEditModel8 = this.LJFF;
                    if (videoPublishEditModel8 == null) {
                        videoPublishEditModel8 = null;
                    }
                    Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel8);
                    int iIntValue = pairLJIIJJI.getFirst().intValue();
                    int iIntValue2 = pairLJIIJJI.getSecond().intValue();
                    c0labLJIIJ.LIZ(iIntValue2, "pic_cnt");
                    c0labLJIIJ.LJ("mix_type", C560460LyW.LIZ(iIntValue, iIntValue2));
                    PublishModel publishModel = this.LJII;
                    if (publishModel == null) {
                        publishModel = null;
                    }
                    if (publishModel.retryType == EnumC1405170mfb.NOT_RETRY) {
                        i4 = 0;
                    }
                    c0labLJIIJ.LIZ(i4, "is_retry");
                    Map<String, String> map = c0labLJIIJ.LIZ;
                    InterfaceC1434300nQa interfaceC1434300nQa = this.LJIIIIZZ;
                    if (interfaceC1434300nQa == null) {
                        interfaceC1434300nQa = null;
                    }
                    interfaceC1434300nQa.LJ().getClass();
                    C20684815ws.LJIILLIIL("publish_fail", map);
                    VideoPublishEditModel videoPublishEditModel9 = this.LJFF;
                    if (videoPublishEditModel9 == null) {
                        videoPublishEditModel9 = null;
                    }
                    String creationId = videoPublishEditModel9.getCreationId();
                    VideoPublishEditModel videoPublishEditModel10 = this.LJFF;
                    if (videoPublishEditModel10 != null) {
                        videoPublishEditModel2 = videoPublishEditModel10;
                    }
                    C1457570o27.LJ(creationId, "video_post_page", "publish_fail", videoPublishEditModel2.hasMusic());
                    if (C1DS1.LIZJ) {
                        C804290Vgp.LIZ(new C804330Vgt(EnumC805430Vif.IC, EnumC804170Vgd.IC_PUBLISH_FAILED, null, 0L, 28));
                    }
                }

                @Override // X.AbstractC1446660nkW
                public final void LJFF(Object obj, Object obj2, boolean z, int i, int i2) {
                    VideoPublishEditModel videoPublishEditModel = null;
                    if (!this.LJIIIZ) {
                        InterfaceC570320MYk interfaceC570320MYkLIZJ = C0CHQ.LIZ().LJI().LIZJ();
                        VideoPublishEditModel videoPublishEditModel2 = this.LJFF;
                        if (videoPublishEditModel2 != null) {
                            videoPublishEditModel = videoPublishEditModel2;
                        }
                        interfaceC570320MYkLIZJ.LJFF(videoPublishEditModel, "postSuccess");
                        ICreativeSocialBridgeService iCreativeSocialBridgeServiceLJII = LJII();
                        if (iCreativeSocialBridgeServiceLJII != null) {
                            iCreativeSocialBridgeServiceLJII.LJIIJJI();
                        }
                        this.LJIIIZ = true;
                        LJIIIZ();
                        return;
                    }
                    throw new C1431180nLY("PublishBizPerformanceMonitor onSuccess has executed", null);
                }
            });
            C1433530nPL c1433530nPL = this.LIZ;
            AbstractC1433570nPP abstractC1433570nPP2 = this.LJI;
            if (abstractC1433570nPP2 == null) {
                abstractC1433570nPP2 = null;
            }
            final C1434660nRA c1434660nRA = new C1434660nRA(c1433530nPL, abstractC1433570nPP2);
            C1D80 c1d803 = this.LIZLLL;
            if (c1d803 == null) {
                c1d803 = null;
            }
            String str = c1d803.LJIIJ;
            C1D80 c1d804 = this.LIZLLL;
            if (c1d804 == null) {
                c1d804 = null;
            }
            final String str2 = c1d804.LJIIJ;
            AbstractC1446660nkW abstractC1446660nkW = new AbstractC1446660nkW(str2, c1434660nRA) { // from class: X.0nR7
                public final C1434660nRA LJ;
                public C1404570med LJFF;
                public C1434970nRf LJI;

                @Override // X.AbstractC1446660nkW
                public final void LIZLLL(Object obj, C556300Lro c556300Lro, AbstractC556190Lrd abstractC556190Lrd) {
                }

                {
                    this.LJ = c1434660nRA;
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
                        if (next instanceof C1404570med) {
                            if (next != null) {
                                this.LJFF = (C1404570med) next;
                                Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    Object next2 = it3.next();
                                    if (next2 instanceof C1434970nRf) {
                                        if (next2 != null) {
                                            C1434970nRf c1434970nRf = (C1434970nRf) next2;
                                            this.LJI = c1434970nRf;
                                            PublishModel publishModel = c1434970nRf.LIZ;
                                            C1404570med c1404570med2 = this.LJFF;
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

                @Override // X.AbstractC1446660nkW
                public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
                    C1434660nRA c1434660nRA2 = this.LJ;
                    C1434680nRC c1434680nRC = new C1434650nR9() { // from class: X.0nRC
                        public static final int $stable = 8;

                        {
                            new RuntimeException();
                        }
                    };
                    C1434970nRf c1434970nRf = this.LJI;
                    if (c1434970nRf == null) {
                        c1434970nRf = null;
                    }
                    c1434660nRA2.LIZIZ(c1434680nRC, c1434970nRf.LIZ);
                }

                @Override // X.AbstractC1446660nkW
                public final void LIZJ(Object obj, C1435220nS4 c1435220nS4, int i, int i2) {
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
                    C1434970nRf c1434970nRf = this.LJI;
                    if (c1434970nRf == null) {
                        c1434970nRf = null;
                    }
                    c1434660nRA2.LIZIZ(c1434650nR9, c1434970nRf.LIZ);
                }

                @Override // X.AbstractC1446660nkW
                public final void LJFF(Object obj, Object obj2, boolean z, int i, int i2) {
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
                                C1434970nRf c1434970nRf2 = this.LJI;
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
            this.LIZJ.LJFF();
            C2280661EOq c2280661EOq = new C2280661EOq(str, abstractC1446660nkW, C1434840nRS.LIZIZ());
            C1D80 c1d805 = this.LIZLLL;
            if (c1d805 == null) {
                c1d805 = null;
            }
            c1d805.LIZ(c2280661EOq);
            ICreativeSocialBridgeService iCreativeSocialBridgeService2 = (ICreativeSocialBridgeService) this.LJII.getValue();
            if (iCreativeSocialBridgeService2 != null) {
                C1D80 c1d806 = this.LIZLLL;
                if (c1d806 == null) {
                    c1d806 = null;
                }
                c1d806.LIZ(iCreativeSocialBridgeService2.LJFF(C1434870nRV.LIZ(false, false, false, true, false, 22), this.LIZJ, "StoryNoteWavePublisher", new AwS636S0100000_22(this, 72)));
            }
        }
        C1D80 c1d807 = this.LIZLLL;
        if (c1d807 != null) {
            c1d80 = c1d807;
        }
        c1d80.LJII();
    }

    public C1434760nRK(C1433530nPL c1433530nPL, C1430790nKv c1430790nKv, C1434310nQb c1434310nQb) {
        this.LIZ = c1433530nPL;
        this.LIZIZ = c1430790nKv;
        this.LIZJ = c1434310nQb;
        this.LJ = new C1434970nRf(c1433530nPL.LIZ);
        this.LJFF = new C1434960nRe((VideoPublishEditModel) c1433530nPL.LIZ.editModel);
    }
}
