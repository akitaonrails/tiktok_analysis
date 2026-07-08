package X;

/* JADX INFO: renamed from: X.0MqC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C580780MqC extends AbstractC796330VLr {
    public final int $t;

    public static final String createQuery$0(C580780MqC c580780MqC) {
        return "INSERT OR REPLACE INTO `album_ai_content` (`uuid`,`task_id`,`ai_type`,`media_type`,`width`,`height`,`duration`,`ai_local_uri`,`ai_remote_uri`,`new_flag`,`anchor_name`,`anchor_id`,`anchor_icon_url`,`extra`,`created_time_ms`,`deleted`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    public static final String createQuery$1(C580780MqC c580780MqC) {
        return "INSERT OR REPLACE INTO `aigc_workflow` (`id`,`creation_id_read_only`,`old_framework_data`,`aigc_workflow_static`,`workflow_config`,`central_registry`,`static_central_registry`,`workflow_state`,`preview_info`,`links`,`source_read_only`,`created_at`,`server_task_id`,`grade_down_count`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    public static final String createQuery$2(C580780MqC c580780MqC) {
        return "INSERT OR REPLACE INTO `live_recordings_content_mapping` (`fragment_id`,`create_time`,`local_file_path`) VALUES (?,?,?)";
    }

    public static final String createQuery$3(C580780MqC c580780MqC) {
        return "INSERT OR REPLACE INTO `creation_async_task` (`id`,`name`,`icon`,`type`,`status`,`async_status`,`step`,`progress`,`child_task_id`,`parent_task_id`,`creation_id`,`creation_version`,`source`,`extra`,`prompt`,`error_code`,`error_msg`,`fail_reason_msg`,`resource_id`,`created_at`,`server_task_id`,`remain_time`,`log_extra`,`ai_creation_id`,`remain_time_stage`,`input_cache`,`quota_result`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // X.AbstractC796330VLr
    public final void bind(InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        switch (this.$t) {
            case 0:
                bind$0(this, interfaceC796340VLs, obj);
                break;
            case 1:
                bind$1(this, interfaceC796340VLs, obj);
                break;
            case 2:
                bind$2(this, interfaceC796340VLs, obj);
                break;
            case 3:
                bind$3(this, interfaceC796340VLs, obj);
                break;
            default:
                super.bind(interfaceC796340VLs, obj);
                break;
        }
    }

    @Override // X.AbstractC795470VIj
    public final String createQuery() {
        switch (this.$t) {
            case 0:
                return createQuery$0(this);
            case 1:
                return createQuery$1(this);
            case 2:
                return createQuery$2(this);
            case 3:
                return createQuery$3(this);
            default:
                return super.createQuery();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C580780MqC(AbstractC796540VMm abstractC796540VMm, int i) {
        super(abstractC796540VMm);
        this.$t = i;
    }

    public static final void bind$0(C580780MqC c580780MqC, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        C535020Kya c535020Kya = (C535020Kya) obj;
        String str = c535020Kya.LIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        String str2 = c535020Kya.LIZIZ;
        if (str2 == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIILIIL(2, str2);
        }
        interfaceC796340VLs.LJIJ(3, c535020Kya.LIZJ);
        interfaceC796340VLs.LJIJ(4, c535020Kya.LIZLLL);
        interfaceC796340VLs.LJIJ(5, c535020Kya.LJ);
        interfaceC796340VLs.LJIJ(6, c535020Kya.LJFF);
        interfaceC796340VLs.LJIJ(7, c535020Kya.LJI);
        String str3 = c535020Kya.LJII;
        if (str3 == null) {
            interfaceC796340VLs.LLD(8);
        } else {
            interfaceC796340VLs.LJIILIIL(8, str3);
        }
        String str4 = c535020Kya.LJIIIIZZ;
        if (str4 == null) {
            interfaceC796340VLs.LLD(9);
        } else {
            interfaceC796340VLs.LJIILIIL(9, str4);
        }
        interfaceC796340VLs.LJIJ(10, c535020Kya.LJIIIZ ? 1L : 0L);
        String str5 = c535020Kya.LJIIJ;
        if (str5 == null) {
            interfaceC796340VLs.LLD(11);
        } else {
            interfaceC796340VLs.LJIILIIL(11, str5);
        }
        String str6 = c535020Kya.LJIIJJI;
        if (str6 == null) {
            interfaceC796340VLs.LLD(12);
        } else {
            interfaceC796340VLs.LJIILIIL(12, str6);
        }
        String str7 = c535020Kya.LJIIL;
        if (str7 == null) {
            interfaceC796340VLs.LLD(13);
        } else {
            interfaceC796340VLs.LJIILIIL(13, str7);
        }
        String str8 = c535020Kya.LJIILIIL;
        if (str8 == null) {
            interfaceC796340VLs.LLD(14);
        } else {
            interfaceC796340VLs.LJIILIIL(14, str8);
        }
        interfaceC796340VLs.LJIJ(15, c535020Kya.LJIILJJIL);
        interfaceC796340VLs.LJIJ(16, c535020Kya.LJIILL);
    }

    public static final void bind$1(C580780MqC c580780MqC, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        C555820Lr2 c555820Lr2 = (C555820Lr2) obj;
        String str = c555820Lr2.LIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        String str2 = c555820Lr2.LIZIZ;
        if (str2 == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIILIIL(2, str2);
        }
        String str3 = c555820Lr2.LIZJ;
        if (str3 == null) {
            interfaceC796340VLs.LLD(3);
        } else {
            interfaceC796340VLs.LJIILIIL(3, str3);
        }
        String str4 = c555820Lr2.LIZLLL;
        if (str4 == null) {
            interfaceC796340VLs.LLD(4);
        } else {
            interfaceC796340VLs.LJIILIIL(4, str4);
        }
        String str5 = c555820Lr2.LJ;
        if (str5 == null) {
            interfaceC796340VLs.LLD(5);
        } else {
            interfaceC796340VLs.LJIILIIL(5, str5);
        }
        String str6 = c555820Lr2.LJFF;
        if (str6 == null) {
            interfaceC796340VLs.LLD(6);
        } else {
            interfaceC796340VLs.LJIILIIL(6, str6);
        }
        String str7 = c555820Lr2.LJI;
        if (str7 == null) {
            interfaceC796340VLs.LLD(7);
        } else {
            interfaceC796340VLs.LJIILIIL(7, str7);
        }
        String str8 = c555820Lr2.LJII;
        if (str8 == null) {
            interfaceC796340VLs.LLD(8);
        } else {
            interfaceC796340VLs.LJIILIIL(8, str8);
        }
        String str9 = c555820Lr2.LJIIIIZZ;
        if (str9 == null) {
            interfaceC796340VLs.LLD(9);
        } else {
            interfaceC796340VLs.LJIILIIL(9, str9);
        }
        String str10 = c555820Lr2.LJIIIZ;
        if (str10 == null) {
            interfaceC796340VLs.LLD(10);
        } else {
            interfaceC796340VLs.LJIILIIL(10, str10);
        }
        String str11 = c555820Lr2.LJIIJ;
        if (str11 == null) {
            interfaceC796340VLs.LLD(11);
        } else {
            interfaceC796340VLs.LJIILIIL(11, str11);
        }
        interfaceC796340VLs.LJIJ(12, c555820Lr2.LJIIJJI);
        String str12 = c555820Lr2.LJIIL;
        if (str12 == null) {
            interfaceC796340VLs.LLD(13);
        } else {
            interfaceC796340VLs.LJIILIIL(13, str12);
        }
        interfaceC796340VLs.LJIJ(14, c555820Lr2.LJIILIIL);
    }

    public static final void bind$2(C580780MqC c580780MqC, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        C533710KwT c533710KwT = (C533710KwT) obj;
        interfaceC796340VLs.LJIJ(1, c533710KwT.LIZ);
        interfaceC796340VLs.LJIJ(2, c533710KwT.LIZIZ);
        String str = c533710KwT.LIZJ;
        if (str == null) {
            interfaceC796340VLs.LLD(3);
        } else {
            interfaceC796340VLs.LJIILIIL(3, str);
        }
    }

    public static final void bind$3(C580780MqC c580780MqC, InterfaceC796340VLs interfaceC796340VLs, Object obj) {
        C0LXL c0lxl = (C0LXL) obj;
        String str = c0lxl.LIZ;
        if (str == null) {
            interfaceC796340VLs.LLD(1);
        } else {
            interfaceC796340VLs.LJIILIIL(1, str);
        }
        String str2 = c0lxl.LIZIZ;
        if (str2 == null) {
            interfaceC796340VLs.LLD(2);
        } else {
            interfaceC796340VLs.LJIILIIL(2, str2);
        }
        String str3 = c0lxl.LIZJ;
        if (str3 == null) {
            interfaceC796340VLs.LLD(3);
        } else {
            interfaceC796340VLs.LJIILIIL(3, str3);
        }
        String str4 = c0lxl.LIZLLL;
        if (str4 == null) {
            interfaceC796340VLs.LLD(4);
        } else {
            interfaceC796340VLs.LJIILIIL(4, str4);
        }
        String str5 = c0lxl.LJ;
        if (str5 == null) {
            interfaceC796340VLs.LLD(5);
        } else {
            interfaceC796340VLs.LJIILIIL(5, str5);
        }
        String str6 = c0lxl.LJFF;
        if (str6 == null) {
            interfaceC796340VLs.LLD(6);
        } else {
            interfaceC796340VLs.LJIILIIL(6, str6);
        }
        String str7 = c0lxl.LJI;
        if (str7 == null) {
            interfaceC796340VLs.LLD(7);
        } else {
            interfaceC796340VLs.LJIILIIL(7, str7);
        }
        interfaceC796340VLs.LJIJ(8, c0lxl.LJII);
        String str8 = c0lxl.LJIIIIZZ;
        if (str8 == null) {
            interfaceC796340VLs.LLD(9);
        } else {
            interfaceC796340VLs.LJIILIIL(9, str8);
        }
        String str9 = c0lxl.LJIIIZ;
        if (str9 == null) {
            interfaceC796340VLs.LLD(10);
        } else {
            interfaceC796340VLs.LJIILIIL(10, str9);
        }
        String str10 = c0lxl.LJIIJ;
        if (str10 == null) {
            interfaceC796340VLs.LLD(11);
        } else {
            interfaceC796340VLs.LJIILIIL(11, str10);
        }
        interfaceC796340VLs.LJIJ(12, c0lxl.LJIIJJI);
        String str11 = c0lxl.LJIIL;
        if (str11 == null) {
            interfaceC796340VLs.LLD(13);
        } else {
            interfaceC796340VLs.LJIILIIL(13, str11);
        }
        String str12 = c0lxl.LJIILIIL;
        if (str12 == null) {
            interfaceC796340VLs.LLD(14);
        } else {
            interfaceC796340VLs.LJIILIIL(14, str12);
        }
        String str13 = c0lxl.LJIILJJIL;
        if (str13 == null) {
            interfaceC796340VLs.LLD(15);
        } else {
            interfaceC796340VLs.LJIILIIL(15, str13);
        }
        interfaceC796340VLs.LJIJ(16, c0lxl.LJIILL);
        String str14 = c0lxl.LJIILLIIL;
        if (str14 == null) {
            interfaceC796340VLs.LLD(17);
        } else {
            interfaceC796340VLs.LJIILIIL(17, str14);
        }
        String str15 = c0lxl.LJIIZILJ;
        if (str15 == null) {
            interfaceC796340VLs.LLD(18);
        } else {
            interfaceC796340VLs.LJIILIIL(18, str15);
        }
        String str16 = c0lxl.LJIJ;
        if (str16 == null) {
            interfaceC796340VLs.LLD(19);
        } else {
            interfaceC796340VLs.LJIILIIL(19, str16);
        }
        interfaceC796340VLs.LJIJ(20, c0lxl.LJIJI);
        String str17 = c0lxl.LJIJJ;
        if (str17 == null) {
            interfaceC796340VLs.LLD(21);
        } else {
            interfaceC796340VLs.LJIILIIL(21, str17);
        }
        interfaceC796340VLs.LJIJ(22, c0lxl.LJIJJLI);
        String str18 = c0lxl.LJIL;
        if (str18 == null) {
            interfaceC796340VLs.LLD(23);
        } else {
            interfaceC796340VLs.LJIILIIL(23, str18);
        }
        String str19 = c0lxl.LJJ;
        if (str19 == null) {
            interfaceC796340VLs.LLD(24);
        } else {
            interfaceC796340VLs.LJIILIIL(24, str19);
        }
        interfaceC796340VLs.LJIJ(25, c0lxl.LJJI);
        String str20 = c0lxl.LJJIFFI;
        if (str20 == null) {
            interfaceC796340VLs.LLD(26);
        } else {
            interfaceC796340VLs.LJIILIIL(26, str20);
        }
        String str21 = c0lxl.LJJII;
        if (str21 == null) {
            interfaceC796340VLs.LLD(27);
        } else {
            interfaceC796340VLs.LJIILIIL(27, str21);
        }
    }
}
