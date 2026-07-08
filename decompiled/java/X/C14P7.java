package X;

import android.content.Context;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.starlight.nodes.StarlightNode;
import com.ss.android.ugc.aweme.nimblecard.tako.model.Layout;
import com.ss.android.ugc.aweme.nimblecard.tako.model.TemplateData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS144S1100000_30;
import kotlin.jvm.internal.AwS179S1100000_30;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.14P7, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14P7 {
    public static final Context LIZ;

    static {
        C844470XAv.LIZ.getClass();
        LIZ = C844470XAv.LIZ();
    }

    public static final Context LIZIZ() {
        AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
        if (abstractC1387200mCcLJFF != null) {
            return abstractC1387200mCcLJFF.LIZIZ();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:1004:0x175f  */
    /* JADX WARN: Removed duplicated region for block: B:1005:0x1762  */
    /* JADX WARN: Removed duplicated region for block: B:1007:0x1769  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:1044:0x1823  */
    /* JADX WARN: Removed duplicated region for block: B:1045:0x1826  */
    /* JADX WARN: Removed duplicated region for block: B:1047:0x182d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:1084:0x18e7  */
    /* JADX WARN: Removed duplicated region for block: B:1085:0x18ea  */
    /* JADX WARN: Removed duplicated region for block: B:1087:0x18f3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:1124:0x19ad  */
    /* JADX WARN: Removed duplicated region for block: B:1125:0x19b0  */
    /* JADX WARN: Removed duplicated region for block: B:1127:0x19b7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:1164:0x1a71  */
    /* JADX WARN: Removed duplicated region for block: B:1165:0x1a74  */
    /* JADX WARN: Removed duplicated region for block: B:1167:0x1a7b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:1204:0x1b35  */
    /* JADX WARN: Removed duplicated region for block: B:1205:0x1b38  */
    /* JADX WARN: Removed duplicated region for block: B:1207:0x1b3f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:1244:0x1bf9  */
    /* JADX WARN: Removed duplicated region for block: B:1245:0x1bfc  */
    /* JADX WARN: Removed duplicated region for block: B:1247:0x1c03  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:1284:0x1cbd  */
    /* JADX WARN: Removed duplicated region for block: B:1285:0x1cc0  */
    /* JADX WARN: Removed duplicated region for block: B:1287:0x1cc7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:1324:0x1d81  */
    /* JADX WARN: Removed duplicated region for block: B:1325:0x1d84  */
    /* JADX WARN: Removed duplicated region for block: B:1327:0x1d8b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:1364:0x1e45  */
    /* JADX WARN: Removed duplicated region for block: B:1365:0x1e48  */
    /* JADX WARN: Removed duplicated region for block: B:1367:0x1e4f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:1404:0x1f09  */
    /* JADX WARN: Removed duplicated region for block: B:1405:0x1f0c  */
    /* JADX WARN: Removed duplicated region for block: B:1407:0x1f13  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:1444:0x1fcd  */
    /* JADX WARN: Removed duplicated region for block: B:1445:0x1fd0  */
    /* JADX WARN: Removed duplicated region for block: B:1447:0x1fd7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:1484:0x2091  */
    /* JADX WARN: Removed duplicated region for block: B:1485:0x2094  */
    /* JADX WARN: Removed duplicated region for block: B:1487:0x209b  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:1524:0x2155  */
    /* JADX WARN: Removed duplicated region for block: B:1525:0x2158  */
    /* JADX WARN: Removed duplicated region for block: B:1527:0x215f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:1564:0x2219  */
    /* JADX WARN: Removed duplicated region for block: B:1565:0x221c  */
    /* JADX WARN: Removed duplicated region for block: B:1567:0x2223  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:1604:0x22dd  */
    /* JADX WARN: Removed duplicated region for block: B:1605:0x22e0  */
    /* JADX WARN: Removed duplicated region for block: B:1607:0x22e7  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:1644:0x23a1  */
    /* JADX WARN: Removed duplicated region for block: B:1645:0x23a4  */
    /* JADX WARN: Removed duplicated region for block: B:1647:0x23ad  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:1684:0x2467  */
    /* JADX WARN: Removed duplicated region for block: B:1685:0x246a  */
    /* JADX WARN: Removed duplicated region for block: B:1687:0x2471  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:1724:0x252b  */
    /* JADX WARN: Removed duplicated region for block: B:1725:0x252e  */
    /* JADX WARN: Removed duplicated region for block: B:1727:0x2535  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:1764:0x25ef  */
    /* JADX WARN: Removed duplicated region for block: B:1765:0x25f2  */
    /* JADX WARN: Removed duplicated region for block: B:1767:0x25f9  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:1804:0x26b3  */
    /* JADX WARN: Removed duplicated region for block: B:1805:0x26b6  */
    /* JADX WARN: Removed duplicated region for block: B:1807:0x26bd  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:1844:0x2777  */
    /* JADX WARN: Removed duplicated region for block: B:1845:0x277a  */
    /* JADX WARN: Removed duplicated region for block: B:1847:0x2781  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:1884:0x283b  */
    /* JADX WARN: Removed duplicated region for block: B:1885:0x283e  */
    /* JADX WARN: Removed duplicated region for block: B:1887:0x2845  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:1924:0x28ff  */
    /* JADX WARN: Removed duplicated region for block: B:1925:0x2902  */
    /* JADX WARN: Removed duplicated region for block: B:1927:0x290b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:1964:0x29c5  */
    /* JADX WARN: Removed duplicated region for block: B:1965:0x29c8  */
    /* JADX WARN: Removed duplicated region for block: B:1967:0x29df  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:2004:0x2a99  */
    /* JADX WARN: Removed duplicated region for block: B:2005:0x2a9c  */
    /* JADX WARN: Removed duplicated region for block: B:2007:0x2ab3  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:2044:0x2b6d  */
    /* JADX WARN: Removed duplicated region for block: B:2045:0x2b70  */
    /* JADX WARN: Removed duplicated region for block: B:2047:0x2b87  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:2084:0x2c41  */
    /* JADX WARN: Removed duplicated region for block: B:2085:0x2c44  */
    /* JADX WARN: Removed duplicated region for block: B:2087:0x2c5b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:2124:0x2d15  */
    /* JADX WARN: Removed duplicated region for block: B:2125:0x2d18  */
    /* JADX WARN: Removed duplicated region for block: B:2127:0x2d3a  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:2164:0x2df4  */
    /* JADX WARN: Removed duplicated region for block: B:2165:0x2df7  */
    /* JADX WARN: Removed duplicated region for block: B:2167:0x2e19  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:2204:0x2ed3  */
    /* JADX WARN: Removed duplicated region for block: B:2205:0x2ed6  */
    /* JADX WARN: Removed duplicated region for block: B:2207:0x2eec  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:2244:0x2fa6  */
    /* JADX WARN: Removed duplicated region for block: B:2245:0x2fa9  */
    /* JADX WARN: Removed duplicated region for block: B:2247:0x2fb0  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:2284:0x306a  */
    /* JADX WARN: Removed duplicated region for block: B:2285:0x306d  */
    /* JADX WARN: Removed duplicated region for block: B:2287:0x3074  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:2324:0x312e  */
    /* JADX WARN: Removed duplicated region for block: B:2325:0x3131  */
    /* JADX WARN: Removed duplicated region for block: B:2329:0x3149  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:2366:0x3203  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:2578:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x084f  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0891  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x08ab  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x08b3  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x08f5  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x090f  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0917  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0926  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0959  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0969  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0973  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x097b  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x098a  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x09bd  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x09cd  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x09d7  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x09df  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x09ee  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0a21  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0a31  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0a3b  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0a43  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0a52  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0a85  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0a95  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0a9f  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0aa7  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0ab8  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0aeb  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0afb  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0b05  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0b0d  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0b1e  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0b51  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0b61  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0b6b  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0b73  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0b84  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0bb7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x0bc7  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0bd1  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0bd9  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0be6  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0c19  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0c29  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0c33  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0c3b  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0c48  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0c7b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0c8b  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0c95  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0c9d  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0cac  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0cdf  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0cef  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0cf9  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0d01  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0d10  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0d43  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0d53  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0d5d  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0d65  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0d74  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0da7  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0db9  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0dc3  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0dcb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0dda  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0e0f  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0e1f  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x0e29  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0e31  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0e40  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0e75  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0e85  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x0e8f  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0e97  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x0ea8  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0edb  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0ef7  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0f01  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x0f09  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x0f1a  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0f4d  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0f67  */
    /* JADX WARN: Removed duplicated region for block: B:612:0x0f71  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0f79  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x0f8a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x0fbd  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x0fd7  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x0fe1  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0fe9  */
    /* JADX WARN: Removed duplicated region for block: B:636:0x0ffa  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x102d  */
    /* JADX WARN: Removed duplicated region for block: B:645:0x1047  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x1051  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x1059  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x106a  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x109d  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x10b7  */
    /* JADX WARN: Removed duplicated region for block: B:666:0x10c1  */
    /* JADX WARN: Removed duplicated region for block: B:669:0x10c9  */
    /* JADX WARN: Removed duplicated region for block: B:672:0x10da  */
    /* JADX WARN: Removed duplicated region for block: B:675:0x110d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:681:0x112b  */
    /* JADX WARN: Removed duplicated region for block: B:684:0x1135  */
    /* JADX WARN: Removed duplicated region for block: B:687:0x113d  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x114e  */
    /* JADX WARN: Removed duplicated region for block: B:693:0x1181  */
    /* JADX WARN: Removed duplicated region for block: B:699:0x1198  */
    /* JADX WARN: Removed duplicated region for block: B:703:0x11a6  */
    /* JADX WARN: Removed duplicated region for block: B:706:0x11b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:743:0x126c  */
    /* JADX WARN: Removed duplicated region for block: B:744:0x126f  */
    /* JADX WARN: Removed duplicated region for block: B:747:0x1284  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:784:0x133e  */
    /* JADX WARN: Removed duplicated region for block: B:786:0x1344  */
    /* JADX WARN: Removed duplicated region for block: B:791:0x1357  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:828:0x1411  */
    /* JADX WARN: Removed duplicated region for block: B:830:0x1417  */
    /* JADX WARN: Removed duplicated region for block: B:835:0x142a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:872:0x14e4  */
    /* JADX WARN: Removed duplicated region for block: B:874:0x14ea  */
    /* JADX WARN: Removed duplicated region for block: B:879:0x14fd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:916:0x15b7  */
    /* JADX WARN: Removed duplicated region for block: B:918:0x15bd  */
    /* JADX WARN: Removed duplicated region for block: B:923:0x15d0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:960:0x168a  */
    /* JADX WARN: Removed duplicated region for block: B:962:0x1690  */
    /* JADX WARN: Removed duplicated region for block: B:967:0x16a5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0253  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(X.C14NX r15, com.ss.android.ugc.aweme.nimblecard.tako.model.Layout r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 13023
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14P7.LIZLLL(X.14NX, com.ss.android.ugc.aweme.nimblecard.tako.model.Layout, boolean):void");
    }

    public static final int LIZJ(Object obj) {
        Object objLJI = C20252814Mk.LJI(obj);
        if (objLJI instanceof C20252914Ml) {
            if (((C20252914Ml) objLJI).LIZ != 100.0f) {
                return -2;
            }
        } else if (objLJI instanceof String) {
            String str = (String) objLJI;
            int iHashCode = str.hashCode();
            if (iHashCode != -258729712) {
                if (iHashCode != 3005871) {
                    if (iHashCode != 797770429 || !str.equals("fit-content")) {
                        return -2;
                    }
                } else {
                    str.equals("auto");
                    return -2;
                }
            } else if (!str.equals("max-content")) {
                return -2;
            }
        } else {
            if (!(objLJI instanceof Number)) {
                return -2;
            }
            return (int) C418440Gaw.LIZIZ((Number) objLJI);
        }
        return -1;
    }

    public static final Object LJIIIZ(String str) {
        String strSubstring;
        String string = a0.LJLIIIL(str).toString();
        if (u.LJIJI(string, "null", true)) {
            return null;
        }
        if (u.LJIJI(string, "true", true)) {
            return Boolean.TRUE;
        }
        if (u.LJIJI(string, "false", true)) {
            return Boolean.FALSE;
        }
        if (a0.LJJLIIIJJIZ(string, '\"') && a0.LJJIJIIJIL(string, '\"') && string.length() >= 2) {
            strSubstring = string.substring(1, string.length() - 1);
        } else if (a0.LJJLIIIJJIZ(string, '\'') && a0.LJJIJIIJIL(string, '\'') && string.length() >= 2) {
            strSubstring = string.substring(1, string.length() - 1);
        } else {
            strSubstring = string;
        }
        if (strSubstring != string) {
            return strSubstring;
        }
        Integer numLJIIJJI = C2095008Iq.LJIIJJI(strSubstring);
        if (numLJIIJJI != null) {
            return Integer.valueOf(numLJIIJJI.intValue());
        }
        Long lLJIILIIL = C2095008Iq.LJIILIIL(strSubstring);
        if (lLJIILIIL != null) {
            return Long.valueOf(lLJIILIIL.longValue());
        }
        Double dLJII = C2327809Ae.LJII(strSubstring);
        if (dLJII != null) {
            return Double.valueOf(dLJII.doubleValue());
        }
        return strSubstring;
    }

    public static final Object LJJ(String str) {
        boolean z;
        boolean z2;
        try {
            String string = a0.LJLIIIL(str).toString();
            if (string.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return null;
            }
            if (u.LJJIIJZLJL(string, e3.e, false) && u.LJIIZILJ(string, e3.f, false)) {
                string = string.substring(1, string.length() - 1);
            }
            if (a0.LJJJIL(string)) {
                return C13BV.INSTANCE;
            }
            List listLJJLIIIJ = a0.LJJLIIIJ(string, new char[]{','}, false, 0, 6);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJ, 10));
            Iterator it2 = listLJJLIIIJ.iterator();
            while (it2.hasNext()) {
                arrayList.add(a0.LJLIIIL((String) it2.next()).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((String) obj).length() <= 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(LJIIIZ((String) it3.next()));
            }
            return arrayList3;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final void LJJI(C14NX c14nx) {
        String str;
        Layout layout;
        if (c14nx.getView().getVisibility() == 0) {
            TemplateData element = c14nx.getElement();
            if (element == null || (layout = element.layout) == null || (str = layout.display) == null) {
                str = "flex";
            }
        } else {
            str = "none";
        }
        if (!Intrinsics.LJFF(str, c14nx.LJIIJJI())) {
            c14nx.LJIILIIL(str);
            c14nx.LJFF().LJ(str);
            View view = c14nx.getView();
            if (!view.isLayoutRequested()) {
                view.requestLayout();
            }
        }
    }

    public static final boolean LIZ(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        if (obj2 == null || obj.getClass() != obj2.getClass()) {
            return false;
        }
        if (obj instanceof List) {
            List list = (List) obj2;
            if (((List) obj).size() != list.size()) {
                return false;
            }
            int i = 0;
            for (Object obj3 : (Iterable) obj) {
                int i2 = i + 1;
                if (i >= 0) {
                    if (!LIZ(obj3, ListProtector.get(list, i))) {
                        return false;
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return true;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) obj2;
            if (objArr.length != objArr2.length) {
                return false;
            }
            int length = objArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                int i5 = i4 + 1;
                if (!LIZ(objArr[i3], objArr2[i4])) {
                    return false;
                }
                i3++;
                i4 = i5;
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj2;
            Map map2 = (Map) obj;
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry entry : map2.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (!map.containsKey(key) || !LIZ(value, map.get(key))) {
                    return false;
                }
            }
            return true;
        }
        return Intrinsics.LJFF(obj, obj2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIJ(X.InterfaceC689530R2x r2, java.lang.String r3) {
        /*
            if (r3 == 0) goto L1a
            X.14O8 r0 = r2.LJFF()
            com.lynx.starlight.nodes.StarlightNode r1 = r0.LIZ
            int r0 = r3.hashCode()
            switch(r0) {
                case -1881872635: goto L52;
                case -1364013995: goto L47;
                case -46581362: goto L3c;
                case 441309761: goto L31;
                case 1742952711: goto L26;
                case 1937124468: goto L1b;
                default: goto Lf;
            }
        Lf:
            X.14PB r0 = X.C14PB.FLEX_START
        L11:
            long r2 = r1.LIZ
            int r0 = r0.ordinal()
            r1.nativeSetAlignContent(r2, r0)
        L1a:
            return
        L1b:
            java.lang.String r0 = "space-around"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lf
            X.14PB r0 = X.C14PB.SPACE_AROUND
            goto L11
        L26:
            java.lang.String r0 = "flex-end"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lf
            X.14PB r0 = X.C14PB.FLEX_END
            goto L11
        L31:
            java.lang.String r0 = "space-between"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lf
            X.14PB r0 = X.C14PB.SPACE_BETWEEN
            goto L11
        L3c:
            java.lang.String r0 = "flex-start"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lf
            X.14PB r0 = X.C14PB.FLEX_START
            goto L11
        L47:
            java.lang.String r0 = "center"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lf
            X.14PB r0 = X.C14PB.CENTER
            goto L11
        L52:
            java.lang.String r0 = "stretch"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lf
            X.14PB r0 = X.C14PB.STRETCH
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14P7.LJIIJ(X.0R2x, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIJJI(X.InterfaceC689530R2x r3, java.lang.String r4) {
        /*
            if (r4 == 0) goto L1a
            X.14O8 r0 = r3.LJFF()
            com.lynx.starlight.nodes.StarlightNode r3 = r0.LIZ
            int r0 = r4.hashCode()
            switch(r0) {
                case -1881872635: goto L47;
                case -1720785339: goto L3c;
                case -1364013995: goto L31;
                case -46581362: goto L26;
                case 1742952711: goto L1b;
                default: goto Lf;
            }
        Lf:
            X.14PD r0 = X.C14PD.STRETCH
        L11:
            long r1 = r3.LIZ
            int r0 = r0.ordinal()
            r3.nativeSetAlignItems(r1, r0)
        L1a:
            return
        L1b:
            java.lang.String r0 = "flex-end"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.14PD r0 = X.C14PD.FLEX_END
            goto L11
        L26:
            java.lang.String r0 = "flex-start"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.14PD r0 = X.C14PD.FLEX_START
            goto L11
        L31:
            java.lang.String r0 = "center"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.14PD r0 = X.C14PD.CENTER
            goto L11
        L3c:
            java.lang.String r0 = "baseline"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.14PD r0 = X.C14PD.BASELINE
            goto L11
        L47:
            java.lang.String r0 = "stretch"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.14PD r0 = X.C14PD.STRETCH
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14P7.LJIIJJI(X.0R2x, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIL(X.C14NX r2, java.lang.String r3) {
        /*
            if (r3 == 0) goto L1a
            X.14O8 r0 = r2.LJFF()
            com.lynx.starlight.nodes.StarlightNode r1 = r0.LIZ
            int r0 = r3.hashCode()
            switch(r0) {
                case -1881872635: goto L52;
                case -1720785339: goto L47;
                case -1364013995: goto L3c;
                case -46581362: goto L31;
                case 3005871: goto L26;
                case 1742952711: goto L1b;
                default: goto Lf;
            }
        Lf:
            X.14PD r0 = X.C14PD.AUTO
        L11:
            long r2 = r1.LIZ
            int r0 = r0.ordinal()
            r1.nativeSetAlignSelf(r2, r0)
        L1a:
            return
        L1b:
            java.lang.String r0 = "flex-end"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lf
            X.14PD r0 = X.C14PD.FLEX_END
            goto L11
        L26:
            java.lang.String r0 = "auto"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lf
            X.14PD r0 = X.C14PD.AUTO
            goto L11
        L31:
            java.lang.String r0 = "flex-start"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lf
            X.14PD r0 = X.C14PD.FLEX_START
            goto L11
        L3c:
            java.lang.String r0 = "center"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lf
            X.14PD r0 = X.C14PD.CENTER
            goto L11
        L47:
            java.lang.String r0 = "baseline"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lf
            X.14PD r0 = X.C14PD.BASELINE
            goto L11
        L52:
            java.lang.String r0 = "stretch"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lf
            X.14PD r0 = X.C14PD.STRETCH
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14P7.LJIIL(X.14NX, java.lang.String):void");
    }

    public static final void LJIILJJIL(C14NX c14nx, String str) {
        C14P8 c14p8;
        if (str != null) {
            C14O8 c14o8LJFF = c14nx.LJFF();
            c14o8LJFF.getClass();
            if (Intrinsics.LJFF(str, "border-box")) {
                c14p8 = C14P8.BORDER_BOX;
            } else if (!Intrinsics.LJFF(str, "content-box")) {
                return;
            } else {
                c14p8 = C14P8.CONTENT_BOX;
            }
            if (c14p8 != null) {
                StarlightNode starlightNode = c14o8LJFF.LIZ;
                starlightNode.nativeSetBoxSizing(starlightNode.LIZ, c14p8.ordinal());
            }
        }
    }

    public static final void LJIILL(C14NX c14nx, String str) {
        if (c14nx.getView().getVisibility() == 0) {
            if (str != null) {
                c14nx.LJFF().LJ(str);
                return;
            }
            return;
        }
        c14nx.LJFF().LJ("none");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIILLIIL(X.InterfaceC689530R2x r3, java.lang.String r4) {
        /*
            if (r4 == 0) goto L1a
            X.14O8 r0 = r3.LJFF()
            com.lynx.starlight.nodes.StarlightNode r3 = r0.LIZ
            int r0 = r4.hashCode()
            switch(r0) {
                case -1448970769: goto L3c;
                case -1354837162: goto L31;
                case 113114: goto L26;
                case 1272730475: goto L1b;
                default: goto Lf;
            }
        Lf:
            X.14Px r0 = X.EnumC20261914Px.COLUMN
        L11:
            long r1 = r3.LIZ
            int r0 = r0.ordinal()
            r3.nativeSetFlexDirection(r1, r0)
        L1a:
            return
        L1b:
            java.lang.String r0 = "column-reverse"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.14Px r0 = X.EnumC20261914Px.COLUMN_REVERSE
            goto L11
        L26:
            java.lang.String r0 = "row"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.14Px r0 = X.EnumC20261914Px.ROW
            goto L11
        L31:
            java.lang.String r0 = "column"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.14Px r0 = X.EnumC20261914Px.COLUMN
            goto L11
        L3c:
            java.lang.String r0 = "row-reverse"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lf
            X.14Px r0 = X.EnumC20261914Px.ROW_REVERSE
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14P7.LJIILLIIL(X.0R2x, java.lang.String):void");
    }

    public static final void LJIIZILJ(C14NX c14nx, Float f) {
        if (f != null) {
            float fFloatValue = f.floatValue();
            C14O8 c14o8LJFF = c14nx.LJFF();
            Float fValueOf = Float.valueOf(fFloatValue);
            c14o8LJFF.getClass();
            if (fValueOf != null) {
                fValueOf.floatValue();
                StarlightNode starlightNode = c14o8LJFF.LIZ;
                starlightNode.nativeSetFlexShrink(starlightNode.LIZ, fValueOf.floatValue());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIJ(X.InterfaceC689530R2x r3, java.lang.String r4) {
        /*
            if (r4 == 0) goto L2e
            X.14O8 r0 = r3.LJFF()
            com.lynx.starlight.nodes.StarlightNode r3 = r0.LIZ
            int r1 = r4.hashCode()
            r0 = -1039592053(0xffffffffc209158b, float:-34.271038)
            if (r1 == r0) goto L3a
            r0 = -749527969(0xffffffffd3531c5f, float:-9.067141E11)
            if (r1 == r0) goto L2f
            r0 = 3657802(0x37d04a, float:5.125672E-39)
            if (r1 != r0) goto L45
            java.lang.String r0 = "wrap"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L45
            X.14Q4 r0 = X.C14Q4.WRAP
        L25:
            long r1 = r3.LIZ
            int r0 = r0.ordinal()
            r3.nativeSetFlexWrap(r1, r0)
        L2e:
            return
        L2f:
            java.lang.String r0 = "wrap-reverse"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L45
            X.14Q4 r0 = X.C14Q4.WRAP_REVERSE
            goto L25
        L3a:
            java.lang.String r0 = "nowrap"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L45
            X.14Q4 r0 = X.C14Q4.NO_WRAP
            goto L25
        L45:
            X.14Q4 r0 = X.C14Q4.NO_WRAP
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14P7.LJIJ(X.0R2x, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:5:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIJI(X.InterfaceC689530R2x r2, java.lang.String r3) {
        /*
            if (r3 == 0) goto L1a
            X.14O8 r0 = r2.LJFF()
            com.lynx.starlight.nodes.StarlightNode r1 = r0.LIZ
            int r0 = r3.hashCode()
            switch(r0) {
                case -1364013995: goto L52;
                case -46581362: goto L47;
                case 441309761: goto L3c;
                case 1742952711: goto L31;
                case 1937124468: goto L26;
                case 2055030478: goto L1b;
                default: goto Lf;
            }
        Lf:
            X.14PE r0 = X.C14PE.FLEX_START
        L11:
            long r2 = r1.LIZ
            int r0 = r0.ordinal()
            r1.nativeSetJustifyContent(r2, r0)
        L1a:
            return
        L1b:
            java.lang.String r0 = "space-evenly"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lf
            X.14PE r0 = X.C14PE.SPACE_EVENLY
            goto L11
        L26:
            java.lang.String r0 = "space-around"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lf
            X.14PE r0 = X.C14PE.SPACE_AROUND
            goto L11
        L31:
            java.lang.String r0 = "flex-end"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lf
            X.14PE r0 = X.C14PE.FLEX_END
            goto L11
        L3c:
            java.lang.String r0 = "space-between"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lf
            X.14PE r0 = X.C14PE.SPACE_BETWEEN
            goto L11
        L47:
            java.lang.String r0 = "flex-start"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lf
            X.14PE r0 = X.C14PE.FLEX_START
            goto L11
        L52:
            java.lang.String r0 = "center"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lf
            X.14PE r0 = X.C14PE.CENTER
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14P7.LJIJI(X.0R2x, java.lang.String):void");
    }

    public static final void LJIJJLI(C14NX c14nx, String str) {
        C14QB c14qb;
        if (str != null) {
            C14O8 c14o8LJFF = c14nx.LJFF();
            c14o8LJFF.getClass();
            if (Intrinsics.LJFF(str, "relative")) {
                c14qb = C14QB.RELATIVE;
            } else if (!Intrinsics.LJFF(str, "absolute")) {
                return;
            } else {
                c14qb = C14QB.ABSOLUTE;
            }
            if (c14qb != null) {
                StarlightNode starlightNode = c14o8LJFF.LIZ;
                starlightNode.nativeSetPositionType(starlightNode.LIZ, c14qb.ordinal());
            }
        }
    }

    public static final boolean LJ(float f, float f2, View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (f < iArr[0] || f2 <= iArr[1] || f > r2 + view.getWidth() || f2 > iArr[1] + view.getHeight()) {
            return false;
        }
        return true;
    }

    public static final void LJFF(C14NX c14nx, Object obj, String str) {
        LJIJJ(obj, new AwS144S1100000_30(c14nx, str, 4), AFwS219S0000000_30.get$arr$(269), new AwS144S1100000_30(c14nx, str, 5));
    }

    public static final void LJI(C14NX c14nx, Object obj, String str) {
        LJIJJ(obj, new AwS144S1100000_30(c14nx, str, 6), new AwS179S1100000_30(c14nx, str, 3), new AwS144S1100000_30(c14nx, str, 7));
    }

    public static final void LJII(C14NX c14nx, Object obj, String str) {
        LJIJJ(obj, new AwS144S1100000_30(c14nx, str, 8), AFwS219S0000000_30.get$arr$(272), new AwS144S1100000_30(c14nx, str, 9));
    }

    public static final void LJIIIIZZ(C14NX c14nx, Object obj, String str) {
        LJIJJ(obj, new AwS144S1100000_30(c14nx, str, 10), AFwS219S0000000_30.get$arr$(273), new AwS144S1100000_30(c14nx, str, 3));
    }

    public static final void LJIILIIL(C14NX c14nx, String str, Float f) {
        if (f != null) {
            float fFloatValue = f.floatValue();
            StarlightNode starlightNode = c14nx.LJFF().LIZ;
            starlightNode.nativeSetBorder(starlightNode.LIZ, C2257631DYb.LIZ(str).ordinal(), fFloatValue);
        }
    }

    public static final void LJIJJ(Object obj, Function1<? super Float, Unit> function1, Function0<Unit> function0, Function1<? super Float, Unit> function12) {
        Object objLJI = C20252814Mk.LJI(obj);
        if (objLJI instanceof C20252914Ml) {
            function1.invoke(Float.valueOf(((C20252914Ml) objLJI).LIZ));
            return;
        }
        if (objLJI instanceof String) {
            if (!Intrinsics.LJFF(objLJI, "auto")) {
                return;
            }
            function0.invoke();
        } else {
            if (!(objLJI instanceof Number)) {
                return;
            }
            function12.invoke(Float.valueOf(C418440Gaw.LIZIZ((Number) objLJI)));
        }
    }

    public static final void LJIL(Object obj, Function1<? super Float, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function1<? super Float, Unit> function12) {
        Object objLJI = C20252814Mk.LJI(obj);
        if (objLJI instanceof C20252914Ml) {
            function1.invoke(Float.valueOf(((C20252914Ml) objLJI).LIZ));
            return;
        }
        if (objLJI instanceof String) {
            String str = (String) objLJI;
            int iHashCode = str.hashCode();
            if (iHashCode != -258729712) {
                if (iHashCode != 3005871) {
                    if (iHashCode != 797770429 || !str.equals("fit-content")) {
                        return;
                    }
                    function03.invoke();
                    return;
                }
                if (!str.equals("auto")) {
                    return;
                }
                function0.invoke();
                return;
            }
            if (!str.equals("max-content")) {
                return;
            }
            function02.invoke();
            return;
        }
        if (!(objLJI instanceof Number)) {
            return;
        }
        function12.invoke(Float.valueOf(C418440Gaw.LIZIZ((Number) objLJI)));
    }
}
