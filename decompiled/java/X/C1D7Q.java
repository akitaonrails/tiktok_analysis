package X;

/* JADX INFO: renamed from: X.1D7Q, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D7Q {
    public static final C2215001Bmc LIZ = C2215001Bmc.LIZ;

    public final String toString() {
        StringBuilder sb = new StringBuilder("Performance: \nUpload: getAlbumPublishCnt = ");
        sb.append(C1D7R.LIZ().LJFF(0, "publish_type_upload_cnt"));
        sb.append(", getAlbumPublishRate = ");
        C2215001Bmc c2215001Bmc = LIZ;
        c2215001Bmc.getClass();
        C01GW c01gw = C2215001Bmc.LIZIZ;
        sb.append(((AbstractC1505150pGr) c01gw.getValue()).LJ("publish_type_upload_rate"));
        sb.append(" \nShoot: getShootPublishCnt = ");
        sb.append(C1D7R.LIZ().LJFF(0, "publish_type_shoot_cnt"));
        sb.append(", getShootPublishRate = ");
        sb.append(C1D7R.LIZ().LJ("publish_type_shoot_rate"));
        sb.append(" \n       getShootLabelV2 = ");
        c2215001Bmc.getClass();
        sb.append(C2215001Bmc.LIZ("shoot_label_v2"));
        sb.append(" \nEffect: getPropCntSum = ");
        sb.append(C1D7R.LIZ().LJ("prop_cnt_sum"));
        sb.append(", getPropCntAvg = ");
        sb.append(((AbstractC1505150pGr) c01gw.getValue()).LJ("prop_cnt_avg"));
        sb.append(" \nPublish: getAllPublishCnt = ");
        sb.append(C304960BxO.LIZ());
        sb.append(", getAllPublishRate = ");
        sb.append(C304960BxO.LIZJ());
        sb.append(" \n        getAllPublishTolerance = ");
        sb.append(C304960BxO.LIZLLL());
        sb.append(", getAllPublishIntentionScore = ");
        sb.append(C304960BxO.LIZIZ());
        sb.append(" \n        getAllPublishNetworkWifiRate = ");
        sb.append(C1D7R.LIZ().LJ("publish_network_wifi_rate"));
        sb.append(", getAllPublishNetworkMobileRate = ");
        sb.append(C1D7R.LIZ().LJ("publish_network_mobile_rate"));
        sb.append(" \nPublish: getAllPublishCnt = ");
        sb.append(C304960BxO.LIZ());
        sb.append(", getAllPublishRate = ");
        sb.append(C304960BxO.LIZJ());
        sb.append(", getAllPublishTolerance = ");
        sb.append(C304960BxO.LIZLLL());
        sb.append(" \n         getPublishEditRate = ");
        sb.append(((AbstractC1505150pGr) c01gw.getValue()).LJ("publish_edit_rate"));
        sb.append(" \nShootSame: getMusicShootSameRate=");
        sb.append(C1D7R.LIZ().LJ("song_shoot_rate"));
        return sb.toString();
    }
}
