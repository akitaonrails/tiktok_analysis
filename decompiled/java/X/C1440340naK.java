package X;

import com.ss.android.ugc.aweme.creative.model.PropFromGroupModel;

/* JADX INFO: renamed from: X.0naK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1440340naK {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C0LAB c0lab, PropFromGroupModel propFromGroupModel) {
        c0lab.LJ("from_prop_resource_id", propFromGroupModel.fromPropResourceId);
        c0lab.LJ("from_prop_id", propFromGroupModel.fromPropId);
        C1440350naL c1440350naL = new C1440350naL(c0lab);
        String str = propFromGroupModel.fromGroupIdPropList;
        String str2 = propFromGroupModel.fromGroupIdPropResourceList;
        c1440350naL.invoke("from_group_id_prop_list", str);
        c1440350naL.invoke("from_group_id_prop_resource_list", str2);
    }
}
