package X;

import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.vm.EasterEggForShareViewModel;
import com.ss.android.ugc.aweme.socialgame.api.service.ISocialGameService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS6S0020000_24;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0qrY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.vm.EasterEggForShareViewModel$initConfig$1", f = "EasterEggForShareViewModel.kt", l = {57}, m = "invokeSuspend")
public final class C1566340qrY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public boolean LL;
    public boolean LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ EasterEggForShareViewModel LLILZ;
    public final /* synthetic */ SessionInfo LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1566340qrY(EasterEggForShareViewModel easterEggForShareViewModel, SessionInfo sessionInfo, InterfaceC1364105Vn<? super C1566340qrY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = easterEggForShareViewModel;
        this.LLILZIL = sessionInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1566340qrY(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        String currentUserID;
        List list;
        Object next;
        Object objLJII = obj;
        C1C7U.LIZ("EasterEggForShareViewModel@5d30.initConfig$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                z2 = this.LLILLJJLI;
                z = this.LL;
                C155000ia.LIZIZ(objLJII);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJII);
            if (C1558920qfa.LIZ().enable == 1 && C1558920qfa.LIZ().samePostEnable == 1) {
                z = true;
            } else {
                z = false;
            }
            if (C1558920qfa.LIZ().enable == 1 && C1558920qfa.LIZ().videoOverflowEnable == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (C1558920qfa.LIZ().isFullyLaunch == 1) {
                this.LLILZ.setState(new AwS6S0020000_24(z, z2, 2));
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("EasterEggForShareViewModel@5d30.initConfig$1");
                return unit;
            }
            C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(this.LLILZIL.getConversationId());
            if (c0y8tLIZ == null) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("EasterEggForShareViewModel@5d30.initConfig$1");
                return unit2;
            }
            IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
            if (iUserService != null && (currentUserID = iUserService.getCurrentUserID()) != null) {
                List<Long> memberIds = c0y8tLIZ.getMemberIds();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(memberIds, 10));
                Iterator<Long> it2 = memberIds.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().toString());
                }
                list = null;
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (!Intrinsics.LJFF(next, currentUserID)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    String str = (String) next;
                    if (str != null) {
                        ArrayList arrayList2 = new ArrayList();
                        if (z) {
                            arrayList2.add("im_easter_egg_for_share.same_post_enable");
                        }
                        if (z2) {
                            arrayList2.add("im_easter_egg_for_share.video_overflow_enable");
                        }
                        if (!arrayList2.isEmpty()) {
                            arrayList2.add("im_easter_egg_for_share.enable");
                            ISocialGameService iSocialGameService = (ISocialGameService) PluggableExtentionKt.pluggableSpi$default(ISocialGameService.class, false, false, false, 14, null);
                            if (iSocialGameService != null) {
                                int i2 = C1558920qfa.LIZ().expVersion;
                                this.LL = z;
                                this.LLILLJJLI = z2;
                                this.LLILLL = 1;
                                objLJII = iSocialGameService.LJII(arrayList2, i2, str, this);
                                if (objLJII == objLJFF) {
                                    C1C7U.LIZIZ("EasterEggForShareViewModel@5d30.initConfig$1");
                                    return objLJFF;
                                }
                            }
                        } else {
                            list = C13BV.INSTANCE;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("initConfig, enableSamePost: ");
                        sbLIZ.append(z);
                        sbLIZ.append(", enableVideoOverflow: ");
                        sbLIZ.append(z2);
                        C2188811AlT.LIZIZ(sbLIZ);
                        this.LLILZ.setState(new C1566350qrZ(z, list, z2));
                        Unit unit3 = Unit.LIZ;
                        C1C7U.LIZIZ("EasterEggForShareViewModel@5d30.initConfig$1");
                        return unit3;
                    }
                }
                Unit unit4 = Unit.LIZ;
                C1C7U.LIZIZ("EasterEggForShareViewModel@5d30.initConfig$1");
                return unit4;
            }
            Unit unit5 = Unit.LIZ;
            C1C7U.LIZIZ("EasterEggForShareViewModel@5d30.initConfig$1");
            return unit5;
        }
        list = (List) objLJII;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("initConfig, enableSamePost: ");
        sbLIZ2.append(z);
        sbLIZ2.append(", enableVideoOverflow: ");
        sbLIZ2.append(z2);
        C2188811AlT.LIZIZ(sbLIZ2);
        this.LLILZ.setState(new C1566350qrZ(z, list, z2));
        Unit unit32 = Unit.LIZ;
        C1C7U.LIZIZ("EasterEggForShareViewModel@5d30.initConfig$1");
        return unit32;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
