package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0m3z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1381850m3z extends C1696260uF6 implements Function2<C1382130m4R<IMContact>, InterfaceC1364105Vn<? super Boolean>, Object>, InterfaceC842703Qz {
    public C1381850m3z(Object obj) {
        super(2, obj, C1381860m40.class, "intercept", "intercept(Lcom/ss/android/ugc/aweme/im/sharepanel/impl/relations/data/core/loader/CombinedLoader$InterceptPayload;)Z", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C1382130m4R<IMContact> c1382130m4R, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        EnumC1381990m4D enumC1381990m4D;
        boolean z;
        C1382130m4R<IMContact> c1382130m4R2 = c1382130m4R;
        C1381860m40 c1381860m40 = (C1381860m40) this.receiver;
        c1381860m40.getClass();
        AbstractC328380Cu4<IMContact> abstractC328380Cu4 = c1382130m4R2.LIZJ;
        if (Intrinsics.LJFF(abstractC328380Cu4, c1381860m40.LLILZIL)) {
            enumC1381990m4D = EnumC1381990m4D.RECENT_CHAT;
        } else if (Intrinsics.LJFF(abstractC328380Cu4, c1381860m40.LLJILJIL)) {
            enumC1381990m4D = EnumC1381990m4D.MUF;
        } else if (Intrinsics.LJFF(abstractC328380Cu4, c1381860m40.LLJI)) {
            enumC1381990m4D = EnumC1381990m4D.MAF;
        } else {
            enumC1381990m4D = EnumC1381990m4D.UNKNOWN;
        }
        C1231704rr c1231704rr = c1381860m40.LLJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("intercept begin list=");
        sbLIZ.append(c1382130m4R2.LIZIZ.size());
        sbLIZ.append(" map=");
        sbLIZ.append(c1382130m4R2.LIZ.size());
        sbLIZ.append(" loadSource=");
        sbLIZ.append(enumC1381990m4D);
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.LIZIZ();
        c1382130m4R2.LIZ.put(c1382130m4R2.LIZJ, c1382130m4R2.LIZIZ);
        for (IMContact iMContact : c1382130m4R2.LIZIZ) {
            iMContact.setInfo(C1367140lgG.LIZ(iMContact.getInfo(), enumC1381990m4D, false, null, null, null, false, null, 126));
        }
        if (Intrinsics.LJFF(c1382130m4R2.LIZJ, c1381860m40.LLILZIL)) {
            c1381860m40.LLIZLLLIL = AbstractC1381820m3w.LJIIIIZZ(c1382130m4R2.LIZIZ);
        } else if (Intrinsics.LJFF(c1382130m4R2.LIZJ, c1381860m40.LLJI)) {
            LinkedHashMap<AbstractC328380Cu4<IMContact>, List<IMContact>> linkedHashMap = c1382130m4R2.LIZ;
            AbstractC328380Cu4<IMContact> abstractC328380Cu42 = c1382130m4R2.LIZJ;
            List<IMContact> list = c1382130m4R2.LIZIZ;
            ArrayList arrayList = new ArrayList();
            for (IMContact iMContact2 : list) {
                if (iMContact2 instanceof IMUser) {
                    IMUser iMUser = (IMUser) iMContact2;
                    if (iMUser.getShareStatus() != 2) {
                        arrayList.add(iMUser);
                    }
                }
            }
            linkedHashMap.put(abstractC328380Cu42, new ArrayList(arrayList));
        }
        c1381860m40.LLJ.LIZIZ();
        if (((ArrayList) C1382140m4S.LIZ(c1382130m4R2.LIZ)).size() < 300) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
