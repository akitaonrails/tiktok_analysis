package X;

import Y.ACListenerS111S0200000_7;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.live.pcs.course.model.CreatePcsAwemeResponse;
import com.ss.android.ugc.aweme.pcs.course.managementpage.vm.IPcsCourseManageVmAbility;
import com.ss.android.ugc.aweme.pcs.course.managementpage.vm.PcsCourseManageVM;
import com.ss.android.ugc.aweme.pcs.course.videopublishpage.vm.IPcsCoursePublishAbility;
import com.ss.android.ugc.aweme.pcs.course.videopublishpage.vm.PcsVideoPublishVM;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS216S0300000_7;
import kotlin.jvm.internal.AwS251S0300000_7;
import kotlin.jvm.internal.AwS408S0200000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS499S0200000_7;

/* JADX INFO: renamed from: X.0JH3, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JH3 extends AbstractC21673619ry<C0JH4> {
    public final Context LL;
    public final InterfaceC665370Q7z LLILLJJLI;
    public final PcsCourseManageVM LLILLL;
    public final PcsVideoPublishVM LLILZ;
    public List<InterfaceC489200JGk> LLILZIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILZIL.size();
    }

    public static void LLLIIIIL(C0JH4 c0jh4) {
        LiveIconView liveIconView = c0jh4.LLILZIL;
        liveIconView.setIcon(C20736316Cj.LIZLLL(R.attr.dn9, c0jh4.itemView.getContext()));
        liveIconView.setIconTintAttr(R.attr.ezu);
        c0jh4.LLILZLL.setText(C497740JfY.LJIJI(2131855831));
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        String strLIZJ;
        InterfaceC665370Q7z interfaceC665370Q7z;
        IPcsCoursePublishAbility iPcsCoursePublishAbility;
        super.onViewRecycled(viewHolder);
        int adapterPosition = viewHolder.getAdapterPosition();
        if (adapterPosition != -1 && adapterPosition < this.LLILZIL.size() && (strLIZJ = ((InterfaceC489200JGk) ListProtector.get(this.LLILZIL, adapterPosition)).LIZJ()) != null && strLIZJ.length() != 0 && (interfaceC665370Q7z = this.LLILLJJLI) != null && (iPcsCoursePublishAbility = (IPcsCoursePublishAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPcsCoursePublishAbility.class, null)) != null) {
            iPcsCoursePublishAbility.Td1(strLIZJ);
        }
    }

    public C0JH3(Context context, InterfaceC665370Q7z interfaceC665370Q7z) {
        PcsCourseManageVM pcsCourseManageVMOL;
        IPcsCoursePublishAbility iPcsCoursePublishAbility;
        IPcsCourseManageVmAbility iPcsCourseManageVmAbility;
        this.LL = context;
        this.LLILLJJLI = interfaceC665370Q7z;
        PcsVideoPublishVM pcsVideoPublishVMAG0 = null;
        if (interfaceC665370Q7z != null && (iPcsCourseManageVmAbility = (IPcsCourseManageVmAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPcsCourseManageVmAbility.class, null)) != null) {
            pcsCourseManageVMOL = iPcsCourseManageVmAbility.oL();
        } else {
            pcsCourseManageVMOL = null;
        }
        this.LLILLL = pcsCourseManageVMOL;
        if (interfaceC665370Q7z != null && (iPcsCoursePublishAbility = (IPcsCoursePublishAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPcsCoursePublishAbility.class, null)) != null) {
            pcsVideoPublishVMAG0 = iPcsCoursePublishAbility.aG0();
        }
        this.LLILZ = pcsVideoPublishVMAG0;
        this.LLILZIL = new ArrayList();
    }

    public static void LLLIILIL(C0JH4 c0jh4, boolean z) {
        int i;
        LiveIconView liveIconView = c0jh4.LLILZIL;
        liveIconView.setIcon(C20736316Cj.LIZLLL(R.attr.d4e, c0jh4.itemView.getContext()));
        liveIconView.setIconTintAttr(R.attr.ezt);
        C16F5 c16f5 = c0jh4.LLILZLL;
        if (z) {
            i = 2131855833;
        } else {
            i = 2131855832;
        }
        c16f5.setText(C497740JfY.LJIJI(i));
    }

    public final void LLLFZ(AbstractC1433460nPE abstractC1433460nPE, InterfaceC489200JGk interfaceC489200JGk) {
        CreatePcsAwemeResponse createPcsAwemeResponse;
        C0JHG c0jhg;
        if (abstractC1433460nPE instanceof C492390JSr) {
            interfaceC489200JGk.LJIILL(C0JH1.UPLOAD_SUCCESS_NOT_PUBLISHED_TO_COURSE);
            CreateBaseAwemeResponse createBaseAwemeResponse = ((C492390JSr) abstractC1433460nPE).LIZ;
            CreatePcsAwemeResponse.Data data = null;
            if (createBaseAwemeResponse instanceof CreatePcsAwemeResponse) {
                createPcsAwemeResponse = (CreatePcsAwemeResponse) createBaseAwemeResponse;
            } else {
                createPcsAwemeResponse = null;
            }
            if ((interfaceC489200JGk instanceof C0JHG) && (c0jhg = (C0JHG) interfaceC489200JGk) != null) {
                if (createPcsAwemeResponse != null) {
                    data = createPcsAwemeResponse.data;
                }
                c0jhg.LJFF = data;
            }
            if (this.LLILLL != null) {
                PcsCourseManageVM.IQ2(interfaceC489200JGk);
                return;
            }
            return;
        }
        if (!(abstractC1433460nPE instanceof C1433450nPD)) {
            return;
        }
        interfaceC489200JGk.LJIILL(C0JH1.UPLOAD_FAILED);
    }

    public final void LLLI(LiveIconView liveIconView, InterfaceC489200JGk interfaceC489200JGk) {
        C500260Jjc.LLFFF(liveIconView);
        liveIconView.setIcon(C20736316Cj.LIZLLL(R.attr.dmc, liveIconView.getContext()));
        liveIconView.setIconTintAttr(R.attr.ezs);
        C635860Owq.LIZ.LIZJ(8, liveIconView);
        C786410Ut5.g8(liveIconView, new ACListenerS111S0200000_7(this, interfaceC489200JGk, 31));
    }

    public final void LLLII(LiveIconView liveIconView, InterfaceC489200JGk interfaceC489200JGk) {
        liveIconView.setIcon(C20736316Cj.LIZLLL(R.attr.el1, liveIconView.getContext()));
        liveIconView.setIconTintAttr(R.attr.ezs);
        C786410Ut5.g8(liveIconView, new ACListenerS111S0200000_7(this, interfaceC489200JGk, 32));
    }

    public final void LLLIL(C0JH4 c0jh4, InterfaceC489200JGk interfaceC489200JGk) {
        C0JH7 c0jh7VQ2;
        float f;
        int i;
        AbstractC1433460nPE abstractC1433460nPE;
        if (this.LLILZ != null) {
            c0jh7VQ2 = PcsVideoPublishVM.vQ2(interfaceC489200JGk.LIZJ());
            if (c0jh7VQ2 != null && (abstractC1433460nPE = c0jh7VQ2.LIZIZ) != null) {
                LLLFZ(abstractC1433460nPE, interfaceC489200JGk);
            }
        } else {
            c0jh7VQ2 = null;
        }
        int i2 = C0JH0.LIZ[interfaceC489200JGk.LJIIIIZZ().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4 || i2 == 5) {
                        C500260Jjc.LJIILIIL(c0jh4.LLIZLLLIL);
                        C500260Jjc.LJIILIIL(c0jh4.LLJ);
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    C500260Jjc.LJIILIIL(c0jh4.LLIZLLLIL);
                    C500260Jjc.LJIILIIL(c0jh4.LLJ);
                    C500260Jjc.LLFFF(c0jh4.LLILZ);
                    C500260Jjc.LLFFF(c0jh4.LLILLL);
                    if (interfaceC489200JGk.LJIJJ() != null) {
                        C1324720kZq c1324720kZq = c0jh4.LL;
                        c1324720kZq.setImageBitmap(null);
                        c1324720kZq.setImageURI("");
                    }
                    LiveIconView liveIconView = c0jh4.LLILZIL;
                    liveIconView.setIcon(C20736316Cj.LIZLLL(R.attr.f551dn3, c0jh4.itemView.getContext()));
                    liveIconView.setIconTintAttr(R.attr.ezu);
                    C16F5 c16f5 = c0jh4.LLILZLL;
                    AwS408S0200000_7 awS408S0200000_7 = new AwS408S0200000_7(this, interfaceC489200JGk, 50);
                    String strLJIJI = C497740JfY.LJIJI(2131855801);
                    C1697506kn.LIZ(c16f5, strLJIJI, C497740JfY.LJIJJ(2131855800, strLJIJI), 8, R.attr.ezq, R.attr.ezu, new AwS251S0300000_7(awS408S0200000_7, this, interfaceC489200JGk, 16));
                    LLLII(c0jh4.LLILZ, interfaceC489200JGk);
                }
            } else {
                C500260Jjc.LJIILIIL(c0jh4.LLIZLLLIL);
                C500260Jjc.LJIILIIL(c0jh4.LLJ);
                C500260Jjc.LLFFF(c0jh4.LLILZ);
                C500260Jjc.LLFFF(c0jh4.LLILLL);
                C0JH6 c0jh6LJIJJ = interfaceC489200JGk.LJIJJ();
                if (c0jh6LJIJJ != null) {
                    C0JH5.LIZ(c0jh6LJIJJ, c0jh4.LL);
                }
                LLLIILIL(c0jh4, false);
                LLLI(c0jh4.LLILZ, interfaceC489200JGk);
            }
        } else {
            C500260Jjc.LLFFF(c0jh4.LLIZLLLIL);
            C500260Jjc.LLFFF(c0jh4.LLJ);
            C426320Gne c426320Gne = c0jh4.LLIZLLLIL;
            if (c0jh7VQ2 != null) {
                f = c0jh7VQ2.LIZ;
            } else {
                f = 0.0f;
            }
            c426320Gne.LIZ(f, false);
            C16F5 c16f52 = c0jh4.LLJ;
            Object[] objArr = new Object[1];
            if (c0jh7VQ2 != null) {
                i = c0jh7VQ2.LIZ;
            } else {
                i = 0;
            }
            objArr[0] = String.valueOf(i);
            c16f52.setText(C497740JfY.LJIJJ(2131855827, objArr));
            C500260Jjc.LJIILIIL(c0jh4.LLILZ);
            C500260Jjc.LJIILIIL(c0jh4.LLILLL);
            if (interfaceC489200JGk.LJIJJ() != null) {
                C1324720kZq c1324720kZq2 = c0jh4.LL;
                c1324720kZq2.setImageBitmap(null);
                c1324720kZq2.setImageURI("");
            }
            LiveIconView liveIconView2 = c0jh4.LLILZIL;
            liveIconView2.setIcon(C20736316Cj.LIZLLL(R.attr.dv9, c0jh4.itemView.getContext()));
            liveIconView2.setIconTintAttr(R.attr.ezt);
            c0jh4.LLILZLL.setText(C497740JfY.LJIJI(2131855820));
        }
        PcsCourseManageVM pcsCourseManageVM = this.LLILLL;
        if (pcsCourseManageVM != null) {
            pcsCourseManageVM.HQ2(interfaceC489200JGk, new AwS586S0100000_7(c0jh4, 397));
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C0JHC c0jhcZQ2;
        int i2;
        LinkedHashMap linkedHashMap;
        C0JH6 c0jh6LJIJJ;
        InterfaceC665370Q7z interfaceC665370Q7z;
        IPcsCoursePublishAbility iPcsCoursePublishAbility;
        C0JH4 c0jh4 = (C0JH4) viewHolder;
        InterfaceC489200JGk interfaceC489200JGk = (InterfaceC489200JGk) ListProtector.get(this.LLILZIL, i);
        String aid = null;
        if (!interfaceC489200JGk.LJIIIIZZ().isUploaded() && (interfaceC665370Q7z = this.LLILLJJLI) != null && (iPcsCoursePublishAbility = (IPcsCoursePublishAbility) C1558520qew.LIZ(interfaceC665370Q7z, IPcsCoursePublishAbility.class, null)) != null) {
            String strLIZJ = interfaceC489200JGk.LIZJ();
            if (strLIZJ == null) {
                strLIZJ = "";
            }
            iPcsCoursePublishAbility.N02(strLIZJ, new AwS216S0300000_7(interfaceC489200JGk, c0jh4, this, 9));
        }
        c0jh4.LLILLJJLI.setText(interfaceC489200JGk.LJIILIIL());
        c0jh4.LLILLL.setText(C488450JDn.LIZ(interfaceC489200JGk));
        if (interfaceC489200JGk.LJIIIIZZ().isUploaded() && (c0jh6LJIJJ = interfaceC489200JGk.LJIJJ()) != null) {
            C0JH5.LIZ(c0jh6LJIJJ, c0jh4.LL);
        }
        C786410Ut5.I7(new AbS499S0200000_7(interfaceC489200JGk, this, 12), c0jh4.LL);
        PcsCourseManageVM pcsCourseManageVM = this.LLILLL;
        if (pcsCourseManageVM != null) {
            c0jhcZQ2 = pcsCourseManageVM.zQ2();
        } else {
            c0jhcZQ2 = null;
        }
        C489110JGb.LJIIJJI(c0jhcZQ2, interfaceC489200JGk, "", "show");
        LLLIL(c0jh4, interfaceC489200JGk);
        if (interfaceC489200JGk.LJIIIIZZ() == C0JH1.UPLOAD_SUCCESS_PUBLISHED_TO_COURSE) {
            int iLIZLLL = interfaceC489200JGk.LIZLLL();
            if (iLIZLLL != 0) {
                if (iLIZLLL != 1) {
                    if (iLIZLLL != 2) {
                        if (iLIZLLL != 3) {
                            if (iLIZLLL != 4) {
                                if (iLIZLLL == 5) {
                                    LiveIconView liveIconView = c0jh4.LLILZIL;
                                    liveIconView.setIcon(C20736316Cj.LIZLLL(R.attr.dn9, c0jh4.itemView.getContext()));
                                    liveIconView.setIconTintAttr(R.attr.ezu);
                                    C16F5 c16f5 = c0jh4.LLILZLL;
                                    c16f5.setText(C497740JfY.LJIJI(2131855789));
                                    c16f5.setTextColor(C20736316Cj.LIZIZ(R.attr.ezu, c16f5.getContext()));
                                }
                            } else {
                                C500260Jjc.LLFFF(c0jh4.LLJI);
                                LiveIconView liveIconView2 = c0jh4.LLILZIL;
                                liveIconView2.setIcon(C20736316Cj.LIZLLL(R.attr.ejo, c0jh4.itemView.getContext()));
                                liveIconView2.setIconTintAttr(R.attr.f03);
                                C16F5 c16f52 = c0jh4.LLILZLL;
                                AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(c0jh4, 650);
                                String strLJIJI = C497740JfY.LJIJI(2131855818);
                                C1697506kn.LIZ(c16f52, strLJIJI, C497740JfY.LJIJJ(2131855817, strLJIJI), 8, R.attr.ezq, R.attr.ezt, new AwS251S0300000_7(awS551S0100000_7, this, interfaceC489200JGk, 15));
                            }
                        } else if (interfaceC489200JGk.LJIL()) {
                            C20337914i1<Map<String, Boolean>> c20337914i1 = InterfaceC1106030et7.k9;
                            Map<String, Boolean> mapLIZIZ = c20337914i1.LIZIZ();
                            if (mapLIZIZ != null) {
                                linkedHashMap = new LinkedHashMap(mapLIZIZ);
                            } else {
                                linkedHashMap = new LinkedHashMap();
                            }
                            Object obj = linkedHashMap.get(String.valueOf(interfaceC489200JGk.LJ(true)));
                            Boolean bool = Boolean.FALSE;
                            if (!Intrinsics.LJFF(obj, bool)) {
                                LLLIIIIL(c0jh4);
                                linkedHashMap.put(String.valueOf(interfaceC489200JGk.LJ(true)), bool);
                                c20337914i1.LJFF(C2097608Jq.LJIIZILJ(linkedHashMap));
                            }
                        } else {
                            LLLIIIIL(c0jh4);
                        }
                    } else {
                        LLLIILIL(c0jh4, interfaceC489200JGk.LJIL());
                    }
                } else {
                    LiveIconView liveIconView3 = c0jh4.LLILZIL;
                    liveIconView3.setIcon(C20736316Cj.LIZLLL(R.attr.ejo, c0jh4.itemView.getContext()));
                    liveIconView3.setIconTintAttr(R.attr.f03);
                    c0jh4.LLILZLL.setText(C497740JfY.LJIJI(2131855830));
                }
            } else {
                C500260Jjc.LJIILIIL(c0jh4.LLIZ);
            }
        }
        ViewGroup viewGroup = c0jh4.LLJI;
        if (interfaceC489200JGk.isMute()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LJLLLLLL(i2, viewGroup);
        if (interfaceC489200JGk.LJIIIIZZ().isUploaded()) {
            if (interfaceC489200JGk.LJIJI() != 2 && interfaceC489200JGk.LJIIL() != 2) {
                LLLI(c0jh4.LLILZ, interfaceC489200JGk);
            } else {
                LLLII(c0jh4.LLILZ, interfaceC489200JGk);
            }
        }
        PcsCourseManageVM pcsCourseManageVM2 = this.LLILLL;
        if (pcsCourseManageVM2 != null) {
            pcsCourseManageVM2.HQ2(interfaceC489200JGk, new AwS586S0100000_7(c0jh4, 398));
        }
        new Object() { // from class: X.0JH9
        }.getClass();
        if (C0C59.LJ().LIZIZ("pcs_course_video_status_setting", false, true) && C0JHB.LIZIZ) {
            C500260Jjc.LLFFF(c0jh4.LLJIJIL);
            C16F5 c16f53 = c0jh4.LLJJIJIIJIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aid:");
            Aweme awemeLJIJJLI = interfaceC489200JGk.LJIJJLI();
            if (awemeLJIJJLI != null) {
                aid = awemeLJIJJLI.getAid();
            }
            sbLIZ.append(aid);
            c16f53.setText(C2188811AlT.LIZIZ(sbLIZ));
            C16F5 c16f54 = c0jh4.LLJILJIL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("label_status:");
            sbLIZ2.append(interfaceC489200JGk.LIZLLL());
            c16f54.setText(C2188811AlT.LIZIZ(sbLIZ2));
            C16F5 c16f55 = c0jh4.LLJILJILJ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("video_review:");
            sbLIZ3.append(interfaceC489200JGk.LJIJI());
            c16f55.setText(C2188811AlT.LIZIZ(sbLIZ3));
            C16F5 c16f56 = c0jh4.LLJILLL;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("audio_review:");
            sbLIZ4.append(interfaceC489200JGk.LJIILJJIL());
            c16f56.setText(C2188811AlT.LIZIZ(sbLIZ4));
            C16F5 c16f57 = c0jh4.LLJJ;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("audio_result:");
            sbLIZ5.append(interfaceC489200JGk.LJIIL());
            c16f57.setText(C2188811AlT.LIZIZ(sbLIZ5));
            C16F5 c16f58 = c0jh4.LLJJI;
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("need_confirm_audio:");
            sbLIZ6.append(interfaceC489200JGk.LJIIIZ());
            c16f58.setText(C2188811AlT.LIZIZ(sbLIZ6));
            C16F5 c16f59 = c0jh4.LLJJIII;
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("cover_review:");
            sbLIZ7.append(interfaceC489200JGk.LJI());
            c16f59.setText(C2188811AlT.LIZIZ(sbLIZ7));
            C16F5 c16f510 = c0jh4.LLJJIJI;
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("title_review:");
            sbLIZ8.append(interfaceC489200JGk.LJIJ());
            c16f510.setText(C2188811AlT.LIZIZ(sbLIZ8));
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0JH4 c0jh4 = new C0JH4(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dfo, viewGroup, false));
        try {
            View view = c0jh4.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0jh4.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0jh4.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0JH4.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0jh4.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0jh4.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0JH4.class.getName();
        return c0jh4;
    }
}
