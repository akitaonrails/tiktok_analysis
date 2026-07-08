package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.model.BehaviorType;
import com.ss.android.ugc.aweme.shortvideo.model.PublishBehaviorModel;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS247S0000000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WiB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C830610WiB {
    public final List<PublishBehaviorModel> LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final AbstractC830620WiC LJI;

    public C830610WiB(String str, List<PublishBehaviorModel> list) {
        PublishBehaviorModel publishBehaviorModel;
        PublishBehaviorModel next;
        boolean z;
        PublishBehaviorModel publishBehaviorModelPrevious;
        AbstractC830620WiC abstractC830620WiCLIZ;
        this.LIZ = list;
        Iterator<PublishBehaviorModel> it2 = list.iterator();
        while (true) {
            publishBehaviorModel = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.stage, "CP")) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (next != null) {
            z = true;
        } else {
            z = false;
        }
        this.LIZIZ = z;
        boolean zLJFF = Intrinsics.LJFF(str, "-1");
        this.LIZJ = zLJFF;
        this.LIZLLL = Intrinsics.LJFF(str, "-2");
        this.LJ = ((PublishBehaviorModel) C13LP.LJJJJZI(this.LIZ)).timeStamp;
        this.LJFF = ((PublishBehaviorModel) C13LP.LJJLIIIJJI(this.LIZ)).timeStamp;
        if (zLJFF) {
            abstractC830620WiCLIZ = new C830640WiE(((PublishBehaviorModel) ListProtector.get(this.LIZ, 0)).code, ((PublishBehaviorModel) ListProtector.get(this.LIZ, 0)).stage);
        } else if (!z) {
            abstractC830620WiCLIZ = C830680WiI.LIZIZ;
        } else {
            Iterator<PublishBehaviorModel> it3 = this.LIZ.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                PublishBehaviorModel next2 = it3.next();
                PublishBehaviorModel publishBehaviorModel2 = next2;
                if (Intrinsics.LJFF(publishBehaviorModel2.stage, "CA") && publishBehaviorModel2.type == BehaviorType.SUCCESS) {
                    if (next2 != null) {
                        abstractC830620WiCLIZ = C830670WiH.LIZIZ;
                    }
                }
            }
            List<PublishBehaviorModel> list2 = this.LIZ;
            ListIterator<PublishBehaviorModel> listIterator = list2.listIterator(list2.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    publishBehaviorModelPrevious = listIterator.previous();
                    if (publishBehaviorModelPrevious.type == BehaviorType.FAILED) {
                        break;
                    }
                } else {
                    publishBehaviorModelPrevious = null;
                    break;
                }
            }
            PublishBehaviorModel publishBehaviorModel3 = publishBehaviorModelPrevious;
            if (publishBehaviorModel3 != null) {
                if (Intrinsics.LJFF(publishBehaviorModel3.stage, "UP") && Intrinsics.LJFF(publishBehaviorModel3.code, "-39995")) {
                    Iterator<PublishBehaviorModel> it4 = this.LIZ.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            break;
                        }
                        PublishBehaviorModel next3 = it4.next();
                        PublishBehaviorModel publishBehaviorModel4 = next3;
                        if (Intrinsics.LJFF(publishBehaviorModel4.stage, "SN") && publishBehaviorModel4.type == BehaviorType.FAILED) {
                            publishBehaviorModel = next3;
                            break;
                        }
                    }
                    PublishBehaviorModel publishBehaviorModel5 = publishBehaviorModel;
                    if (publishBehaviorModel5 == null) {
                        abstractC830620WiCLIZ = new C830650WiF("CONFLICT");
                    } else {
                        abstractC830620WiCLIZ = new C830640WiE(publishBehaviorModel5.code, publishBehaviorModel5.stage);
                    }
                } else {
                    abstractC830620WiCLIZ = new C830640WiE(publishBehaviorModel3.code, publishBehaviorModel3.stage);
                }
            } else {
                abstractC830620WiCLIZ = LIZ("SN", AFwS247S0000000_13.get$arr$(59));
                if (abstractC830620WiCLIZ == null && (abstractC830620WiCLIZ = LIZ("AK", AFwS247S0000000_13.get$arr$(60))) == null && (abstractC830620WiCLIZ = LIZ("UP", AFwS247S0000000_13.get$arr$(61))) == null && (abstractC830620WiCLIZ = LIZ("CA", AFwS247S0000000_13.get$arr$(62))) == null) {
                    abstractC830620WiCLIZ = new C830650WiF("UNKNOW");
                }
            }
        }
        this.LJI = abstractC830620WiCLIZ;
    }

    public final C830660WiG LIZ(String str, Function1<? super PublishBehaviorModel, Boolean> function1) {
        PublishBehaviorModel next;
        boolean z;
        BehaviorType behaviorType;
        Iterator<PublishBehaviorModel> it2 = this.LIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (function1.invoke(next).booleanValue()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        boolean z2 = true;
        if (next != null) {
            z = true;
        } else {
            z = false;
        }
        for (PublishBehaviorModel publishBehaviorModel : this.LIZ) {
            PublishBehaviorModel publishBehaviorModel2 = publishBehaviorModel;
            if (Intrinsics.LJFF(publishBehaviorModel2.stage, str) && ((behaviorType = publishBehaviorModel2.type) == BehaviorType.SUCCESS || behaviorType == BehaviorType.FAILED)) {
                if (publishBehaviorModel == null) {
                    z2 = false;
                }
                if (z || z2) {
                    return null;
                }
                return new C830660WiG(str);
            }
        }
        z2 = false;
        if (z) {
        }
        return null;
    }
}
