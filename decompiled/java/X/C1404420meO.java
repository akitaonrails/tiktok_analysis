package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.creative.model.CelebrationData;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.StoryGroupPublishModel;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.story.IStoryService;
import com.ss.android.ugc.aweme.story.celebration.IStoryCelebrationService;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0meO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1404420meO extends AbstractC1446660nkW {
    public final String LJ;
    public VideoPublishEditModel LJFF;
    public int LJI;
    public C1405220mfg LJII;
    public C1404570med LJIIIIZZ;
    public PublishModel LJIIIZ;
    public InterfaceC1434300nQa LJIIJ;
    public C556300Lro LJIIJJI;
    public C556300Lro LJIIL;
    public C556300Lro LJIILIIL;
    public boolean LJIILJJIL;
    public C556300Lro LJIILL;
    public C556300Lro LJIILLIIL;
    public boolean LJIIZILJ;

    public C1404420meO() {
        super("DefaultWavePublisher", (List<? extends Object>) C1697810uHb.LJIIJJI(EnumC1434770nRL.COMPILE, EnumC1434770nRL.UPLOAD, EnumC1434770nRL.CREATE_AWEME));
        this.LJ = "DefaultWavePublisher";
    }

    public final C0LAB LJIIL() {
        C1404570med c1404570med = this.LJIIIIZZ;
        if (c1404570med == null) {
            c1404570med = null;
        }
        C1420470n4H c1420470n4H = new C1420470n4H(c1404570med.LIZ);
        VideoPublishEditModel videoPublishEditModel = this.LJFF;
        VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel != null ? videoPublishEditModel : null;
        C0LAB c0lab = new C0LAB();
        c1420470n4H.LIZ(videoPublishEditModel2, c0lab);
        return c0lab;
    }

    /* JADX WARN: Removed duplicated region for block: B:1005:0x12e1  */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:1013:0x1302  */
    /* JADX WARN: Removed duplicated region for block: B:1016:0x130a  */
    /* JADX WARN: Removed duplicated region for block: B:1019:0x1311  */
    /* JADX WARN: Removed duplicated region for block: B:1025:0x1327  */
    /* JADX WARN: Removed duplicated region for block: B:1028:0x1342  */
    /* JADX WARN: Removed duplicated region for block: B:1037:0x135c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:1040:0x136c  */
    /* JADX WARN: Removed duplicated region for block: B:1048:0x137e  */
    /* JADX WARN: Removed duplicated region for block: B:1055:0x1399  */
    /* JADX WARN: Removed duplicated region for block: B:1058:0x13a1  */
    /* JADX WARN: Removed duplicated region for block: B:1061:0x13a9  */
    /* JADX WARN: Removed duplicated region for block: B:1064:0x13b9  */
    /* JADX WARN: Removed duplicated region for block: B:1067:0x13be  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:1074:0x13d5  */
    /* JADX WARN: Removed duplicated region for block: B:1077:0x13e0  */
    /* JADX WARN: Removed duplicated region for block: B:1083:0x13fd  */
    /* JADX WARN: Removed duplicated region for block: B:1086:0x140e  */
    /* JADX WARN: Removed duplicated region for block: B:1089:0x1421  */
    /* JADX WARN: Removed duplicated region for block: B:1090:0x1423  */
    /* JADX WARN: Removed duplicated region for block: B:1091:0x1425  */
    /* JADX WARN: Removed duplicated region for block: B:1093:0x142c  */
    /* JADX WARN: Removed duplicated region for block: B:1094:0x142f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:1100:0x1460  */
    /* JADX WARN: Removed duplicated region for block: B:1103:0x146e  */
    /* JADX WARN: Removed duplicated region for block: B:1106:0x1479  */
    /* JADX WARN: Removed duplicated region for block: B:1112:0x1496  */
    /* JADX WARN: Removed duplicated region for block: B:1115:0x14a7  */
    /* JADX WARN: Removed duplicated region for block: B:1118:0x14ba  */
    /* JADX WARN: Removed duplicated region for block: B:1121:0x14cc  */
    /* JADX WARN: Removed duplicated region for block: B:1124:0x14d5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:1134:0x14ef  */
    /* JADX WARN: Removed duplicated region for block: B:1140:0x14fb  */
    /* JADX WARN: Removed duplicated region for block: B:1143:0x1503  */
    /* JADX WARN: Removed duplicated region for block: B:1146:0x150d  */
    /* JADX WARN: Removed duplicated region for block: B:1149:0x151e  */
    /* JADX WARN: Removed duplicated region for block: B:1152:0x1527  */
    /* JADX WARN: Removed duplicated region for block: B:1155:0x1539  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:1192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x07c6  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x07f9  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x08b3  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x08d6  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x08e4  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x090f  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0918  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0968  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0971  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0983  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0991  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x09ba  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x09c8  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x09f5  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0a03  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0a13  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0a1a  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0a40  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0a47  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0a71  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0a83  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0a8a  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0ab0  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0abf  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0ad6  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0ae2  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0aed  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0b04  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0b0b  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0b15  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0b2b  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0b33  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0b3c  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x0b5f  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0b71  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x0b78  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0b83  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x0b91  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0ba1  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0ba8  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0bb3  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0bba  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x0bc5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x0bdb  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0be9  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x0bf3  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0c14  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0c1e  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0c27  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x0c32  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x0c39  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x0c44  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x0c4b  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x0c56  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0c5f  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x0c6a A[PHI: r6
      0x0c6a: PHI (r6v89 java.lang.String) = (r6v88 java.lang.String), (r6v154 java.lang.String) binds: [B:632:0x0c5d, B:636:0x0c68] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:640:0x0c73  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x0c7c  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x0c87  */
    /* JADX WARN: Removed duplicated region for block: B:649:0x0c9c  */
    /* JADX WARN: Removed duplicated region for block: B:652:0x0ca9  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x0cb6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:671:0x0ce5  */
    /* JADX WARN: Removed duplicated region for block: B:674:0x0cf2  */
    /* JADX WARN: Removed duplicated region for block: B:677:0x0d02  */
    /* JADX WARN: Removed duplicated region for block: B:683:0x0d16  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x0d23  */
    /* JADX WARN: Removed duplicated region for block: B:691:0x0d38  */
    /* JADX WARN: Removed duplicated region for block: B:694:0x0d43  */
    /* JADX WARN: Removed duplicated region for block: B:697:0x0d4b  */
    /* JADX WARN: Removed duplicated region for block: B:700:0x0d5b  */
    /* JADX WARN: Removed duplicated region for block: B:703:0x0d78  */
    /* JADX WARN: Removed duplicated region for block: B:706:0x0d82  */
    /* JADX WARN: Removed duplicated region for block: B:710:0x0d9b  */
    /* JADX WARN: Removed duplicated region for block: B:713:0x0db2  */
    /* JADX WARN: Removed duplicated region for block: B:714:0x0db4  */
    /* JADX WARN: Removed duplicated region for block: B:735:0x0dea  */
    /* JADX WARN: Removed duplicated region for block: B:736:0x0ded  */
    /* JADX WARN: Removed duplicated region for block: B:737:0x0df0  */
    /* JADX WARN: Removed duplicated region for block: B:738:0x0df4  */
    /* JADX WARN: Removed duplicated region for block: B:739:0x0df8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:740:0x0dfc  */
    /* JADX WARN: Removed duplicated region for block: B:741:0x0e00  */
    /* JADX WARN: Removed duplicated region for block: B:742:0x0e04  */
    /* JADX WARN: Removed duplicated region for block: B:749:0x0e1d  */
    /* JADX WARN: Removed duplicated region for block: B:750:0x0e29  */
    /* JADX WARN: Removed duplicated region for block: B:751:0x0e2c  */
    /* JADX WARN: Removed duplicated region for block: B:752:0x0e2f  */
    /* JADX WARN: Removed duplicated region for block: B:754:0x0e37  */
    /* JADX WARN: Removed duplicated region for block: B:758:0x0e42  */
    /* JADX WARN: Removed duplicated region for block: B:759:0x0e45  */
    /* JADX WARN: Removed duplicated region for block: B:762:0x0e4f  */
    /* JADX WARN: Removed duplicated region for block: B:766:0x0e6a A[LOOP:3: B:764:0x0e64->B:766:0x0e6a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:769:0x0e7c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:773:0x0e96 A[LOOP:4: B:771:0x0e90->B:773:0x0e96, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:776:0x0eb0  */
    /* JADX WARN: Removed duplicated region for block: B:780:0x0eca A[LOOP:5: B:778:0x0ec4->B:780:0x0eca, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:784:0x0f21  */
    /* JADX WARN: Removed duplicated region for block: B:797:0x0f72  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:802:0x0fa8  */
    /* JADX WARN: Removed duplicated region for block: B:805:0x0fb5  */
    /* JADX WARN: Removed duplicated region for block: B:808:0x0fc1  */
    /* JADX WARN: Removed duplicated region for block: B:817:0x0fd8  */
    /* JADX WARN: Removed duplicated region for block: B:820:0x0fe0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:833:0x102f  */
    /* JADX WARN: Removed duplicated region for block: B:841:0x1049 A[LOOP:8: B:839:0x1043->B:841:0x1049, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:852:0x107a  */
    /* JADX WARN: Removed duplicated region for block: B:855:0x108b  */
    /* JADX WARN: Removed duplicated region for block: B:858:0x1097  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:861:0x109f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:892:0x1116  */
    /* JADX WARN: Removed duplicated region for block: B:895:0x111e  */
    /* JADX WARN: Removed duplicated region for block: B:898:0x112b  */
    /* JADX WARN: Removed duplicated region for block: B:907:0x1149  */
    /* JADX WARN: Removed duplicated region for block: B:910:0x1154  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:922:0x118f  */
    /* JADX WARN: Removed duplicated region for block: B:925:0x119a  */
    /* JADX WARN: Removed duplicated region for block: B:933:0x11bd  */
    /* JADX WARN: Removed duplicated region for block: B:936:0x11cf  */
    /* JADX WARN: Removed duplicated region for block: B:939:0x11e1  */
    /* JADX WARN: Removed duplicated region for block: B:942:0x11ec  */
    /* JADX WARN: Removed duplicated region for block: B:945:0x11f9  */
    /* JADX WARN: Removed duplicated region for block: B:948:0x120d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:951:0x121a  */
    /* JADX WARN: Removed duplicated region for block: B:954:0x1225  */
    /* JADX WARN: Removed duplicated region for block: B:957:0x122d  */
    /* JADX WARN: Removed duplicated region for block: B:960:0x1237  */
    /* JADX WARN: Removed duplicated region for block: B:963:0x1241  */
    /* JADX WARN: Removed duplicated region for block: B:966:0x124b  */
    /* JADX WARN: Removed duplicated region for block: B:969:0x1253  */
    /* JADX WARN: Removed duplicated region for block: B:972:0x1261  */
    /* JADX WARN: Removed duplicated region for block: B:975:0x1269  */
    /* JADX WARN: Removed duplicated region for block: B:978:0x1279  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:981:0x1296  */
    /* JADX WARN: Removed duplicated region for block: B:984:0x12a0  */
    /* JADX WARN: Removed duplicated region for block: B:987:0x12a8  */
    /* JADX WARN: Removed duplicated region for block: B:990:0x12b2  */
    /* JADX WARN: Removed duplicated region for block: B:993:0x12bd  */
    /* JADX WARN: Removed duplicated region for block: B:996:0x12c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI() {
        /*
            Method dump skipped, instruction units count: 5437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1404420meO.LJIIJJI():void");
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
        c0lab.LIZ(0, "story_note");
        c0lab.LJ("from_group_id", strLJII);
        c0lab.LIZ(i, "get_method");
        C20684815ws.LJIILLIIL("publish_finish_from_group_id", c0lab.LIZ);
        return strLJII;
    }

    public final void LJIIJ(CreateAwemeResponse createAwemeResponse) {
        String realImportPath;
        String strOptString;
        JSONObject jSONObjectOptJSONObject;
        ImportVideoInfo importVideoInfo;
        if (!C2514609tI.LIZ) {
            return;
        }
        try {
            VideoPublishEditModel videoPublishEditModel = this.LJFF;
            String aid = null;
            if (videoPublishEditModel == null) {
                videoPublishEditModel = null;
            }
            ArrayList<ImportVideoInfo> arrayList = videoPublishEditModel.creativeModel.albumModel.importInfoList;
            if (arrayList != null && (importVideoInfo = (ImportVideoInfo) C13LP.LJJJLL(arrayList)) != null) {
                realImportPath = importVideoInfo.getRealImportPath();
            } else {
                realImportPath = null;
            }
            String str = (String) C23203097h.LIZ(realImportPath).get("description");
            if (str != null && (jSONObjectOptJSONObject = new JSONArray(str).optJSONObject(0)) != null) {
                strOptString = jSONObjectOptJSONObject.optString("sourceAppID");
            } else {
                strOptString = null;
            }
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("source_app_id", strOptString);
            C844470XAv.LIZ.getClass();
            c0lab.LIZ(C844470XAv.LJIIJ, "current_app_id");
            Aweme aweme = createAwemeResponse.aweme;
            if (aweme != null) {
                aid = aweme.getAid();
            }
            c0lab.LJ("video_id", aid);
            c0lab.LJ("user_id", C0CHQ.LIZ().getAccountService().getCurrentUserID());
            C20684815ws.LJIILLIIL("video_publish_detect", c0lab.LIZ);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.AbstractC1446660nkW, X.InterfaceC1840230xzJ
    public void onEvent(AbstractC556190Lrd abstractC556190Lrd) {
        super.onEvent(abstractC556190Lrd);
        Object obj = abstractC556190Lrd.LIZ;
        if (obj == EnumC1434770nRL.UPLOAD) {
            if (abstractC556190Lrd instanceof C556240Lri) {
                this.LJIIJJI = abstractC556190Lrd.LIZIZ;
                return;
            } else {
                if (!(abstractC556190Lrd instanceof C556250Lrj)) {
                    return;
                }
                this.LJIIL = abstractC556190Lrd.LIZIZ;
                return;
            }
        }
        if (obj == EnumC1434770nRL.CREATE_AWEME) {
            if (!(abstractC556190Lrd instanceof C556250Lrj)) {
                return;
            }
            this.LJIILIIL = abstractC556190Lrd.LIZIZ;
            if (!((Boolean) C280500Az2.LIZ.getValue()).booleanValue()) {
                return;
            }
            LJIIJJI();
            return;
        }
        if (obj != EnumC1434770nRL.COMPILE) {
            return;
        }
        if (abstractC556190Lrd instanceof C556240Lri) {
            this.LJIILL = abstractC556190Lrd.LIZIZ;
        } else {
            if (!(abstractC556190Lrd instanceof C556250Lrj)) {
                return;
            }
            this.LJIILLIIL = abstractC556190Lrd.LIZIZ;
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

    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJII(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5, X.C0LAB r6) {
        /*
            com.ss.android.ugc.aweme.canvas.CanvasVideoData r0 = r5.getCanvasVideoData()
            r4 = 0
            if (r0 == 0) goto L9b
            com.ss.android.ugc.aweme.canvas.CanvasExtra r0 = r0.extra
            if (r0 == 0) goto L9b
            com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra r3 = r0.forwardCanvasExtra
            if (r3 == 0) goto L9c
            int r0 = r3.forwardAwemeType
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "repost_aweme_type"
            r6.LJ(r0, r1)
        L1a:
            com.ss.android.ugc.aweme.canvas.CanvasVideoData r0 = r5.getCanvasVideoData()
            if (r0 == 0) goto L99
            com.ss.android.ugc.aweme.canvas.CanvasExtra r0 = r0.extra
            if (r0 == 0) goto L99
            com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra r0 = r0.forwardCanvasExtra
            if (r0 == 0) goto L99
            int r1 = r0.shareToStoryMediaType
        L2a:
            r0 = 3
            r2 = 0
            if (r1 == r0) goto L8f
            r0 = 4
            if (r1 == r0) goto L8f
            r1 = 0
        L32:
            boolean r0 = X.C1428470nHB.LJJZZI(r5)
            if (r0 != 0) goto L96
            if (r1 != 0) goto L40
            boolean r0 = r5.isPhotoMvMode()
            if (r0 == 0) goto L42
        L40:
            r2 = 61
        L42:
            java.lang.String r1 = "aweme_type"
            java.lang.String r0 = java.lang.String.valueOf(r2)
            r6.LJ(r1, r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "[share2story] publish_finish aweme_type="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " repost_aweme_type="
            r1.append(r0)
            if (r3 == 0) goto L64
            int r0 = r3.forwardAwemeType
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L64:
            r1.append(r4)
            java.lang.String r0 = " isImageMode="
            r1.append(r0)
            boolean r0 = X.C1428470nHB.LJJZZI(r5)
            r1.append(r0)
            java.lang.String r0 = " isPhotoMvMode="
            r1.append(r0)
            boolean r0 = r5.isPhotoMvMode()
            r1.append(r0)
            java.lang.String r0 = " creationId="
            r1.append(r0)
            java.lang.String r0 = r5.getCreationId()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            return
        L8f:
            r1 = 1
            boolean r0 = X.C0BWL.LIZ()
            if (r0 == 0) goto L32
        L96:
            r2 = 152(0x98, float:2.13E-43)
            goto L42
        L99:
            r1 = -1
            goto L2a
        L9b:
            r3 = r4
        L9c:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "appendShareToStoryPublishFinishParams: forwardCanvasExtra is null creationId="
            r1.append(r0)
            java.lang.String r0 = r5.getCreationId()
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1404420meO.LJII(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.0LAB):void");
    }

    public static void LJIIIZ(PublishModel publishModel, C0LAB c0lab) {
        if (C290670BaL.LIZ()) {
            StoryGroupPublishModel storyGroupPublishModel = publishModel.storyGroupPublishModel;
            if (storyGroupPublishModel != null) {
                c0lab.LIZ(1, "is_batch_sub");
                c0lab.LJ("origin_creation_id", storyGroupPublishModel.groupId);
                return;
            }
            Integer num = publishModel.isBatchSub;
            if (num == null) {
                return;
            }
            c0lab.LIZ(num.intValue(), "is_batch_sub");
            c0lab.LJ("origin_creation_id", publishModel.creationId);
            return;
        }
        StoryGroupPublishModel storyGroupPublishModel2 = publishModel.storyGroupPublishModel;
        if (storyGroupPublishModel2 == null) {
            return;
        }
        c0lab.LIZ(1, "is_batch_sub");
        c0lab.LJ("origin_creation_id", storyGroupPublishModel2.groupId);
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
                    VideoPublishEditModel videoPublishEditModel = ((C1434960nRe) next).LIZ;
                    this.LJFF = videoPublishEditModel;
                    if (videoPublishEditModel == null) {
                        videoPublishEditModel = null;
                    }
                    this.LJI = C1428470nHB.LJLILLLLZI(videoPublishEditModel) ? 1 : 0;
                    Iterator<Object> it3 = c1404610meh.LIZ.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next2 = it3.next();
                        if (next2 instanceof C1434970nRf) {
                            if (next2 != null) {
                                this.LJIIIZ = ((C1434970nRf) next2).LIZ;
                                Iterator<Object> it4 = c1404610meh.LIZ.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        break;
                                    }
                                    Object next3 = it4.next();
                                    if (next3 instanceof C1405220mfg) {
                                        if (next3 != null) {
                                            this.LJII = (C1405220mfg) next3;
                                            Iterator<Object> it5 = c1404610meh.LIZ.iterator();
                                            while (true) {
                                                if (!it5.hasNext()) {
                                                    break;
                                                }
                                                Object next4 = it5.next();
                                                if (next4 instanceof C1404570med) {
                                                    if (next4 != null) {
                                                        this.LJIIIIZZ = (C1404570med) next4;
                                                        Iterator<Object> it6 = c1404610meh.LIZ.iterator();
                                                        while (true) {
                                                            if (!it6.hasNext()) {
                                                                break;
                                                            }
                                                            Object next5 = it6.next();
                                                            if (next5 instanceof InterfaceC1434300nQa) {
                                                                if (next5 != null) {
                                                                    this.LJIIJ = (InterfaceC1434300nQa) next5;
                                                                    if (((Boolean) C304880BxG.LIZIZ.getValue()).booleanValue()) {
                                                                        C0CNO.LIZLLL(0L, AFwS210S0000000_22.get$arr$(288));
                                                                        return;
                                                                    }
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
    public final void LIZIZ(C556300Lro c556300Lro, Object obj, Object obj2) {
        if (obj2 instanceof C556260Lrk) {
            Object obj3 = ((C556260Lrk) obj2).LIZ;
            if (obj3 instanceof PublishModel) {
                this.LJIIIZ = (PublishModel) obj3;
            }
        }
    }

    @Override // X.AbstractC1446660nkW
    public final void LIZ(Object obj, AbstractC1404540mea abstractC1404540mea, int i, int i2) {
        int i3;
        String str;
        String string;
        C0LAB c0labLJIIL = LJIIL();
        VideoPublishEditModel videoPublishEditModel = this.LJFF;
        VideoPublishEditModel videoPublishEditModel2 = null;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        c0labLJIIL.LJ("shoot_way", videoPublishEditModel.mShootWay);
        VideoPublishEditModel videoPublishEditModel3 = this.LJFF;
        if (videoPublishEditModel3 == null) {
            videoPublishEditModel3 = null;
        }
        c0labLJIIL.LIZ(videoPublishEditModel3.isOpenForegroundPublish() ? 1 : 0, "is_open_foreground");
        VideoPublishEditModel videoPublishEditModel4 = this.LJFF;
        if (videoPublishEditModel4 == null) {
            videoPublishEditModel4 = null;
        }
        c0labLJIIL.LIZ(videoPublishEditModel4.isBackgroundPublish() ? 1 : 0, "is_background_publish");
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
        c0labLJIIL.LIZ(i3, "is_story");
        C1405220mfg c1405220mfg = this.LJII;
        if (c1405220mfg == null) {
            c1405220mfg = null;
        }
        if (c1405220mfg.LIZIZ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJIIL.LJ("is_click_publish", str);
        VideoPublishEditModel videoPublishEditModel6 = this.LJFF;
        if (videoPublishEditModel6 == null) {
            videoPublishEditModel6 = null;
        }
        c0labLJIIL.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel6));
        PublishModel publishModel = this.LJIIIZ;
        if (publishModel == null) {
            publishModel = null;
        }
        if (publishModel.retryType == EnumC1405170mfb.NOT_RETRY) {
            i4 = 0;
        }
        c0labLJIIL.LIZ(i4, "is_retry");
        VideoPublishEditModel videoPublishEditModel7 = this.LJFF;
        if (videoPublishEditModel7 == null) {
            videoPublishEditModel7 = null;
        }
        Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel7);
        int iIntValue = pairLJIIJJI.getFirst().intValue();
        int iIntValue2 = pairLJIIJJI.getSecond().intValue();
        c0labLJIIL.LIZ(iIntValue2, "pic_cnt");
        c0labLJIIL.LJ("mix_type", C560460LyW.LIZ(iIntValue, iIntValue2));
        boolean z = abstractC1404540mea instanceof C1404560mec;
        if (z) {
            Object obj2 = ((C1404560mec) abstractC1404540mea).LIZ;
            if (obj2 != null) {
                string = obj2.toString();
            } else {
                string = null;
            }
            c0labLJIIL.LJ("cancel_reason", string);
        } else if (abstractC1404540mea instanceof C1404550meb) {
            c0labLJIIL.LIZ(((C1404550meb) abstractC1404540mea).LIZ.getCode(), "error_code");
        }
        Map<String, String> map = c0labLJIIL.LIZ;
        InterfaceC1434300nQa interfaceC1434300nQa = this.LJIIJ;
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
        int i4;
        String str;
        String str2;
        PublishModel publishModel = this.LJIIIZ;
        VideoPublishEditModel videoPublishEditModel = null;
        if (publishModel == null) {
            publishModel = null;
        }
        if (publishModel.retryType != EnumC1405170mfb.NOT_RETRY) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        C0LAB c0labLJIIL = LJIIL();
        VideoPublishEditModel videoPublishEditModel2 = this.LJFF;
        if (videoPublishEditModel2 == null) {
            videoPublishEditModel2 = null;
        }
        c0labLJIIL.LJ("shoot_way", videoPublishEditModel2.mShootWay);
        VideoPublishEditModel videoPublishEditModel3 = this.LJFF;
        if (videoPublishEditModel3 == null) {
            videoPublishEditModel3 = null;
        }
        c0labLJIIL.LIZ(videoPublishEditModel3.isOpenForegroundPublish() ? 1 : 0, "is_open_foreground");
        VideoPublishEditModel videoPublishEditModel4 = this.LJFF;
        if (videoPublishEditModel4 == null) {
            videoPublishEditModel4 = null;
        }
        c0labLJIIL.LIZ(videoPublishEditModel4.isBackgroundPublish() ? 1 : 0, "is_background_publish");
        VideoPublishEditModel videoPublishEditModel5 = this.LJFF;
        if (videoPublishEditModel5 == null) {
            videoPublishEditModel5 = null;
        }
        if (videoPublishEditModel5.getTtStoryUploadModel() != null) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        c0labLJIIL.LIZ(i4, "is_story");
        c0labLJIIL.LIZ(c1435220nS4.getCode(), "error_code");
        C1405220mfg c1405220mfg = this.LJII;
        if (c1405220mfg == null) {
            c1405220mfg = null;
        }
        if (c1405220mfg.LIZIZ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c0labLJIIL.LJ("is_click_publish", str);
        VideoPublishEditModel videoPublishEditModel6 = this.LJFF;
        if (videoPublishEditModel6 == null) {
            videoPublishEditModel6 = null;
        }
        c0labLJIIL.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel6));
        VideoPublishEditModel videoPublishEditModel7 = this.LJFF;
        if (videoPublishEditModel7 == null) {
            videoPublishEditModel7 = null;
        }
        c0labLJIIL.LJ("creation_id", videoPublishEditModel7.getCreationId());
        c0labLJIIL.LIZ(i3, "is_retry");
        VideoPublishEditModel videoPublishEditModel8 = this.LJFF;
        if (videoPublishEditModel8 == null) {
            videoPublishEditModel8 = null;
        }
        if (C1428470nHB.LJJZZI(videoPublishEditModel8)) {
            VideoPublishEditModel videoPublishEditModel9 = this.LJFF;
            if (videoPublishEditModel9 == null) {
                videoPublishEditModel9 = null;
            }
            c0labLJIIL.LIZ(C1428470nHB.LJJJJLL(videoPublishEditModel9) ? 1 : 0, "is_canvas_as_image");
        }
        VideoPublishEditModel videoPublishEditModel10 = this.LJFF;
        if (videoPublishEditModel10 == null) {
            videoPublishEditModel10 = null;
        }
        Pair<Integer, Integer> pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel10);
        int iIntValue = pairLJIIJJI.getFirst().intValue();
        int iIntValue2 = pairLJIIJJI.getSecond().intValue();
        c0labLJIIL.LIZ(iIntValue2, "pic_cnt");
        c0labLJIIL.LJ("mix_type", C560460LyW.LIZ(iIntValue, iIntValue2));
        Map<String, String> map = c0labLJIIL.LIZ;
        InterfaceC1434300nQa interfaceC1434300nQa = this.LJIIJ;
        if (interfaceC1434300nQa == null) {
            interfaceC1434300nQa = null;
        }
        interfaceC1434300nQa.LJ().getClass();
        C20684815ws.LJIILLIIL("publish_fail", map);
        VideoPublishEditModel videoPublishEditModel11 = this.LJFF;
        if (videoPublishEditModel11 == null) {
            videoPublishEditModel11 = null;
        }
        String creationId = videoPublishEditModel11.getCreationId();
        VideoPublishEditModel videoPublishEditModel12 = this.LJFF;
        if (videoPublishEditModel12 == null) {
            videoPublishEditModel12 = null;
        }
        C1457570o27.LJ(creationId, "video_post_page", "publish_fail", videoPublishEditModel12.hasMusic());
        if (C1DS1.LIZJ) {
            C804290Vgp.LIZ(new C804330Vgt(EnumC805430Vif.IC, EnumC804170Vgd.IC_PUBLISH_FAILED, null, 0L, 28));
        }
        if (((Boolean) C304880BxG.LIZIZ.getValue()).booleanValue()) {
            C0CNO.LIZLLL(0L, AFwS210S0000000_22.get$arr$(287));
        }
        VideoPublishEditModel videoPublishEditModel13 = this.LJFF;
        if (videoPublishEditModel13 == null) {
            videoPublishEditModel13 = null;
        }
        if (videoPublishEditModel13.creativeModel.onThisDayData.isFromOnThisDay()) {
            VideoPublishEditModel videoPublishEditModel14 = this.LJFF;
            if (videoPublishEditModel14 == null) {
                videoPublishEditModel14 = null;
            }
            ArrayList<String> localMediaMimeType = videoPublishEditModel14.creativeModel.onThisDayData.getLocalMediaMimeType();
            if (localMediaMimeType != null && !localMediaMimeType.isEmpty()) {
                VideoPublishEditModel videoPublishEditModel15 = this.LJFF;
                if (videoPublishEditModel15 == null) {
                    videoPublishEditModel15 = null;
                }
                ArrayList<String> localMediaMimeType2 = videoPublishEditModel15.creativeModel.onThisDayData.getLocalMediaMimeType();
                if (localMediaMimeType2 != null) {
                    C0ML7 c0ml7 = C0ML7.LIZ;
                    VideoPublishEditModel videoPublishEditModel16 = this.LJFF;
                    if (videoPublishEditModel16 != null) {
                        videoPublishEditModel = videoPublishEditModel16;
                    }
                    if (videoPublishEditModel.getTtStoryUploadModel() != null) {
                        str2 = "story_publish";
                    } else {
                        str2 = "publish";
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c1435220nS4.getCode());
                    sbLIZ.append(": ");
                    sbLIZ.append(c1435220nS4.getMessage());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c0ml7.getClass();
                    C0ML7.LJIILIIL(str2, strLIZIZ, localMediaMimeType2);
                }
            }
        }
    }

    @Override // X.AbstractC1446660nkW
    public final void LJFF(Object obj, Object obj2, boolean z, int i, int i2) {
        Integer celebrationType;
        IStoryCelebrationService iStoryCelebrationServiceLJJLIIIJLLLLLLLZ;
        VideoPublishEditModel videoPublishEditModel = null;
        if (!this.LJIILJJIL) {
            InterfaceC570320MYk interfaceC570320MYkLIZJ = C0CHQ.LIZ().LJI().LIZJ();
            VideoPublishEditModel videoPublishEditModel2 = this.LJFF;
            if (videoPublishEditModel2 == null) {
                videoPublishEditModel2 = null;
            }
            interfaceC570320MYkLIZJ.LJFF(videoPublishEditModel2, "postSuccess");
            if (!Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").getBoolean("redesign_has_posted", false)) {
                Keva.getRepo("TOOLS_PUBLISH_REPO_NAME").storeBoolean("redesign_has_posted", true);
            }
            VideoPublishEditModel videoPublishEditModel3 = this.LJFF;
            if (videoPublishEditModel3 == null) {
                videoPublishEditModel3 = null;
            }
            if (C1428470nHB.LJJZZI(videoPublishEditModel3)) {
                C1260640iuU c1260640iuULIZ = C1260620iuS.LIZ();
                c1260640iuULIZ.LIZ.storeLong(C1260640iuU.LIZ("timestamp_last_photo_mode_publish"), new Date().getTime());
                if (c1260640iuULIZ.LIZ.getInt(C1260640iuU.LIZ("number_of_times_generic_notice_shown"), 0) > 0 && c1260640iuULIZ.LIZ.getLong(C1260640iuU.LIZ("timestamp_first_photo_mode_publish_since_generic_notice"), -1L) == -1) {
                    c1260640iuULIZ.LIZ.storeLong(C1260640iuU.LIZ("timestamp_first_photo_mode_publish_since_generic_notice"), new Date().getTime());
                }
                if (!c1260640iuULIZ.LIZ.getBoolean("publish_since_photo_mode_educate_experiment", false)) {
                    c1260640iuULIZ.LIZ.storeBoolean("publish_since_photo_mode_educate_experiment", true);
                }
            }
            VideoPublishEditModel videoPublishEditModel4 = this.LJFF;
            if (videoPublishEditModel4 == null) {
                videoPublishEditModel4 = null;
            }
            if (videoPublishEditModel4.creativeModel.onThisDayData.isFromOnThisDay()) {
                C0ML6.LIZ.getClass();
                Keva kevaLIZ = C0ML6.LIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("key_last_publish_time_");
                sbLIZ.append(((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId());
                kevaLIZ.storeLong(C2188811AlT.LIZIZ(sbLIZ), System.currentTimeMillis());
            }
            VideoPublishEditModel videoPublishEditModel5 = this.LJFF;
            if (videoPublishEditModel5 == null) {
                videoPublishEditModel5 = null;
            }
            CelebrationData celebrationData = videoPublishEditModel5.creativeModel.celebrationData;
            if (celebrationData != null && (celebrationType = celebrationData.getCelebrationType()) != null && celebrationType.intValue() == 2) {
                C363750ENx.LIZ.LIZIZ("has_show_eoy_guide", true);
                IStoryService iStoryService = (IStoryService) PluggableExtentionKt.pluggableSpi$default(IStoryService.class, false, false, false, 14, null);
                if (iStoryService != null && (iStoryCelebrationServiceLJJLIIIJLLLLLLLZ = iStoryService.LJJLIIIJLLLLLLLZ()) != null) {
                    VideoPublishEditModel videoPublishEditModel6 = this.LJFF;
                    if (videoPublishEditModel6 == null) {
                        videoPublishEditModel6 = null;
                    }
                    iStoryCelebrationServiceLJJLIIIJLLLLLLLZ.exitInboxStoryCelebrationEntrance(videoPublishEditModel6);
                }
            }
            this.LJIILJJIL = true;
            LJIIJJI();
            C1367960lha.LIZ.getClass();
            IPoiService iPoiServiceLIZ = C1367960lha.LIZ();
            VideoPublishEditModel videoPublishEditModel7 = this.LJFF;
            if (videoPublishEditModel7 != null) {
                videoPublishEditModel = videoPublishEditModel7;
            }
            iPoiServiceLIZ.LJIJJ(videoPublishEditModel.creativeModel);
            if (((Boolean) C304880BxG.LIZIZ.getValue()).booleanValue()) {
                C0CNO.LIZLLL(0L, AFwS210S0000000_22.get$arr$(289));
                return;
            }
            return;
        }
        throw new C1431180nLY("PublishBizPerformanceMonitor onSuccess has executed", null);
    }
}
