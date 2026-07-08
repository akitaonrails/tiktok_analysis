package com.bytedance.android.btm.impl.setting;

import X.C09CT;
import X.C13BV;
import X.C1972007ny;
import com.ss.android.ugc.aweme.lazydata.LazyDataBase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class VirtualNode extends LazyDataBase {

    @C09CT("add_all_bcm_to_chain")
    public final int addAllBcmToChain;

    @C09CT("add_hot_start_link_interval")
    public final int addHotStartInterval;

    @C09CT("backup_v")
    public final String backupV;

    @C09CT("decode_url")
    public final int decodeUrl;

    @C09CT("source_to_virtual_node")
    public final List<SourceToVirtualNode> sourceToVirtualNode;

    @C09CT("url_allow_list")
    public final List<String> urlAllowList;

    @C09CT("url_block_list")
    public final List<String> urlBlockList;

    @C09CT("virtual_node_change_pre_list")
    public final List<VirtualNodeChangePre> virtualNodeChangePreList;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    @C09CT("switch")
    public final boolean f20switch = true;

    @C09CT("allow_mode")
    public final int allowMode = 1;

    public final int LIZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "add_all_bcm_to_chain", Integer.valueOf(this.addAllBcmToChain));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.addAllBcmToChain;
        this.addAllBcmToChain = iIntValue;
        return iIntValue;
    }

    public final int LIZIZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "add_hot_start_link_interval", Integer.valueOf(this.addHotStartInterval));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.addHotStartInterval;
        this.addHotStartInterval = iIntValue;
        return iIntValue;
    }

    public final int LIZJ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "allow_mode", Integer.valueOf(this.allowMode));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.allowMode;
        this.allowMode = iIntValue;
        return iIntValue;
    }

    public final String LIZLLL() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "backup_v", this.backupV);
        if (!(objLIZIZ instanceof String)) {
            objLIZIZ = null;
        }
        String str = (String) objLIZIZ;
        if (str == null) {
            str = this.backupV;
        }
        this.backupV = str;
        return str;
    }

    public final int LJ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "decode_url", Integer.valueOf(this.decodeUrl));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.decodeUrl;
        this.decodeUrl = iIntValue;
        return iIntValue;
    }

    public final List<SourceToVirtualNode> LJFF() {
        ArrayList arrayListLIZ = C1972007ny.LIZ(this, this.sourceToVirtualNode, SourceToVirtualNode.class, "source_to_virtual_node");
        this.sourceToVirtualNode = arrayListLIZ;
        return arrayListLIZ;
    }

    public final boolean LJI() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "switch", Boolean.valueOf(this.f20switch));
        if (!(objLIZIZ instanceof Boolean)) {
            objLIZIZ = null;
        }
        Boolean bool = (Boolean) objLIZIZ;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : this.f20switch;
        this.f20switch = zBooleanValue;
        return zBooleanValue;
    }

    public final List<String> LJII() {
        ArrayList arrayListLIZ = C1972007ny.LIZ(this, this.urlAllowList, String.class, "url_allow_list");
        this.urlAllowList = arrayListLIZ;
        return arrayListLIZ;
    }

    public final List<String> LJIIIIZZ() {
        ArrayList arrayListLIZ = C1972007ny.LIZ(this, this.urlBlockList, String.class, "url_block_list");
        this.urlBlockList = arrayListLIZ;
        return arrayListLIZ;
    }

    public final List<VirtualNodeChangePre> LJIIIZ() {
        ArrayList arrayListLIZ = C1972007ny.LIZ(this, this.virtualNodeChangePreList, VirtualNodeChangePre.class, "virtual_node_change_pre_list");
        this.virtualNodeChangePreList = arrayListLIZ;
        return arrayListLIZ;
    }

    public VirtualNode() {
        C13BV c13bv = C13BV.INSTANCE;
        this.urlAllowList = c13bv;
        this.urlBlockList = c13bv;
        this.sourceToVirtualNode = c13bv;
        this.backupV = "_v9876";
        this.virtualNodeChangePreList = c13bv;
        this.decodeUrl = 1;
        this.addAllBcmToChain = 1;
        this.addHotStartInterval = 1;
    }
}
