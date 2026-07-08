package X;

import android.os.Message;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.profile.UserResponse;
import com.ss.android.ugc.aweme.profile.model.SignatureExtraInfo;
import com.ss.android.ugc.aweme.profile.model.SpecialAccount;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0iAx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1232410iAx implements WeakHandler.IHandler, InterfaceC1232320iAo {
    public boolean LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public final WeakHandler LLIZLLLIL;
    public InterfaceC1232420iAy LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public InterfaceC1255580imK LLJILJILJ;
    public final int LLJILLL;

    public C1232410iAx() {
        this(0);
    }

    @Override // X.InterfaceC1232320iAo
    public final boolean LJI() {
        if (this.LL) {
            return false;
        }
        this.LL = true;
        ((AbstractC848400XPy) C0XQ7.LJFF()).LJJII(this.LLIZLLLIL);
        return true;
    }

    public C1232410iAx(int i) {
        this.LLJI = true;
        this.LLJILLL = i;
        this.LL = false;
        this.LLILLJJLI = false;
        this.LLILLL = false;
        this.LLILZ = false;
        this.LLILZIL = false;
        this.LLJILJIL = false;
        this.LLIZLLLIL = new WeakHandler(this);
    }

    @Override // X.InterfaceC1232320iAo
    public final void LIZ(InterfaceC1232420iAy interfaceC1232420iAy) {
        this.LLJ = interfaceC1232420iAy;
    }

    @Override // X.InterfaceC1232320iAo
    public final void LIZIZ(Map<String, String> map) {
        if (map == null || map.size() == 0 || this.LL) {
            return;
        }
        this.LL = true;
        map.put("page_from", String.valueOf(this.LLJILLL));
        ((AbstractC848400XPy) C0XQ7.LJFF()).LJJLJLI(this.LLIZLLLIL, map);
    }

    @Override // X.InterfaceC1232320iAo
    public final void LIZJ(String str) {
        if (this.LLILZLL) {
            return;
        }
        this.LLILZLL = true;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        AbstractC848400XPy abstractC848400XPy = (AbstractC848400XPy) iAccountUserServiceLJFF;
        abstractC848400XPy.LJJLIIIIJ(this.LLJILLL, this.LLIZLLLIL, str);
    }

    public final void LJII(String str) {
        if (this.LLIZ) {
            return;
        }
        this.LLIZ = true;
        ((AbstractC848400XPy) C0XQ7.LJFF()).LJJJ(str, this.LLIZLLLIL);
    }

    public final void LJIIIIZZ(String str) {
        if (this.LLILLJJLI) {
            return;
        }
        this.LLILLJJLI = true;
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        AbstractC848400XPy abstractC848400XPy = (AbstractC848400XPy) iAccountUserServiceLJFF;
        abstractC848400XPy.LJJLIIIJILLIZJL(this.LLJILLL, this.LLIZLLLIL, str, null);
    }

    public final void LJIIJ(int i) {
        if (this.LLILZ) {
            return;
        }
        this.LLILZ = true;
        ((AbstractC848400XPy) C0XQ7.LJFF()).LJJLIL(this.LLIZLLLIL, i, this.LLJILLL);
        if (i == 0) {
            ((AbstractC848400XPy) C0XQ7.LJFF()).LJJJZ(null);
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (HandlerHook.getMessageObj(message.obj) instanceof Exception) {
            LJFF(message.what, (Exception) HandlerHook.getMessageObj(message.obj));
            return;
        }
        if (HandlerHook.getMessageObj(message.obj) instanceof User) {
            LJ(message.what, (User) HandlerHook.getMessageObj(message.obj));
            return;
        }
        if (HandlerHook.getMessageObj(message.obj) instanceof UserResponse) {
            UserResponse userResponse = (UserResponse) HandlerHook.getMessageObj(message.obj);
            if (userResponse.getAction() == 1) {
                String str = userResponse.status_msg;
                this.LL = false;
                this.LLILLJJLI = false;
                InterfaceC1232420iAy interfaceC1232420iAy = this.LLJ;
                if (interfaceC1232420iAy != null) {
                    interfaceC1232420iAy.aL0(str, true);
                }
                LJFF(message.what, null);
                return;
            }
            if (userResponse.getAction() == 2) {
                String str2 = userResponse.status_msg;
                this.LL = false;
                this.LLILLJJLI = false;
                InterfaceC1232420iAy interfaceC1232420iAy2 = this.LLJ;
                if (interfaceC1232420iAy2 != null) {
                    interfaceC1232420iAy2.aL0(str2, false);
                }
                LJFF(message.what, null);
                return;
            }
            LJ(message.what, userResponse.getUser());
            return;
        }
        if (!(HandlerHook.getMessageObj(message.obj) instanceof BaseResponse)) {
            return;
        }
        BaseResponse baseResponse = (BaseResponse) HandlerHook.getMessageObj(message.obj);
        if (baseResponse.status_code != 0) {
            String str3 = baseResponse.status_msg;
            this.LL = false;
            this.LLILLJJLI = false;
            InterfaceC1232420iAy interfaceC1232420iAy3 = this.LLJ;
            if (interfaceC1232420iAy3 != null) {
                interfaceC1232420iAy3.aL0(str3, false);
            }
            LJFF(message.what, null);
            return;
        }
        LJ(message.what, null);
    }

    public final void LIZLLL(User user, boolean z) {
        if (user.getCustomVerify() != null && user.getEnterpriseVerifyReason() != null) {
            if ((!user.getCustomVerify().equals("") || !user.getEnterpriseVerifyReason().equals("")) && z) {
                SpecialAccount specialAccount = user.specialAccount;
                if (specialAccount != null) {
                    if (specialAccount.getSeller() == null) {
                        LJII(user.getUniqueId());
                        return;
                    } else {
                        if (user.specialAccount.getSeller().getType() == 1) {
                            return;
                        }
                        LJII(user.getUniqueId());
                        return;
                    }
                }
                LJII(user.getUniqueId());
            }
        }
    }

    public final void LJ(int i, User user) {
        String str;
        String str2;
        if (user == null && i != 128) {
            return;
        }
        if (i != 0) {
            if (i != 2) {
                if (i != 112) {
                    if (i != 116) {
                        if (i != 122) {
                            if (i != 128) {
                                if (i != 4) {
                                    if (i != 5) {
                                        switch (i) {
                                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                                ((AbstractC848400XPy) C0XQ7.LJFF()).LJJJJL(user.getCoverUrls());
                                                break;
                                            case BdTuring.TYPE_EMAIL /* 11 */:
                                                ((AbstractC848400XPy) C0XQ7.LJFF()).LJJLI(user.getVideoCover());
                                                break;
                                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                                this.LLILZ = false;
                                                ((AbstractC848400XPy) C0XQ7.LJFF()).LJJJZ(user.getProfileNgoStruct());
                                                break;
                                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                                ((AbstractC848400XPy) C0XQ7.LJFF()).LJJJZ(user.getProfileNgoStruct());
                                                break;
                                        }
                                    } else {
                                        ((AbstractC848400XPy) C0XQ7.LJFF()).LJJJJJ(user.getAllowStatus());
                                    }
                                } else {
                                    ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().setAvatarUpdateReminder(false);
                                    this.LLILZIL = false;
                                    ((AbstractC848400XPy) C0XQ7.LJFF()).LJJJJJL(user.getAvatarThumb(), user.getAvatarMedium(), user.getAvatarLarger());
                                }
                            } else {
                                this.LLIZ = false;
                                ((AbstractC848400XPy) C0XQ7.LJFF()).LJJIZ();
                            }
                        } else {
                            ((AbstractC848400XPy) C0XQ7.LJFF()).LJJJLIIL(user.isSecret());
                        }
                    } else {
                        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
                        C0XQ7.LJ();
                        C0XQ7.LIZ.LJIIL().updateMethodInfo("update_name", curUser.getUniqueId());
                        curUser.setNicknameUpdateReminder(false);
                        this.LLILZLL = false;
                        ((AbstractC848400XPy) C0XQ7.LJFF()).LJJL(user.getUniqueId());
                        if (user.getCustomVerify() == null) {
                            user.setCustomVerify("");
                        }
                        if (user.getEnterpriseVerifyReason() == null) {
                            user.setEnterpriseVerifyReason("");
                        }
                        LIZLLL(user, this.LLJI);
                        if (this.LLJI) {
                            str2 = "BVusernamechange_click_change_name_change";
                        } else {
                            str2 = "BVusernamechange_click_submit_request_submit";
                        }
                        if (this.LLJILJIL) {
                            C1231820iA0.LIZ.getClass();
                            C1231820iA0.LIZIZ(str2);
                        }
                    }
                } else {
                    this.LL = false;
                    ((AbstractC848400XPy) C0XQ7.LJFF()).LJIL(user);
                }
            } else {
                this.LLILLL = false;
                List<SignatureExtraInfo> signatureExtra = user.getSignatureExtra();
                if (signatureExtra != null && !signatureExtra.isEmpty()) {
                    ((AbstractC848400XPy) C0XQ7.LJFF()).LJJJLZIJ(user.getSignature(), signatureExtra);
                } else {
                    ((AbstractC848400XPy) C0XQ7.LJFF()).LJJJLL(user.getSignature());
                }
            }
        } else {
            this.LLILLJJLI = false;
            LIZLLL(user, this.LLJIJIL);
            if (this.LLJIJIL) {
                str = "BVnamechange_click_change_name_change";
            } else {
                str = "BVnamechange_click_submit_request_submit";
            }
            if (this.LLJILJIL) {
                C1231820iA0.LIZ.getClass();
                C1231820iA0.LIZIZ(str);
            }
            ((AbstractC848400XPy) C0XQ7.LJFF()).LJJJJZ(user.getNickname());
        }
        InterfaceC1232420iAy interfaceC1232420iAy = this.LLJ;
        if (interfaceC1232420iAy != null) {
            interfaceC1232420iAy.Ud0(i, user);
            if (!this.LLILZIL && !this.LLILLJJLI && !this.LLILLL && !this.LLILZ && !this.LLILZLL && !this.LL && !this.LLIZ) {
                this.LLJ.Pc0(true);
            }
        }
        InterfaceC1255580imK interfaceC1255580imK = this.LLJILJILJ;
        if (interfaceC1255580imK != null) {
            interfaceC1255580imK.LIZJ();
        }
    }

    public final void LJFF(int i, Exception exc) {
        String str;
        String str2;
        if (i != 0) {
            if (i != 112) {
                if (i != 116) {
                    if (i != 122) {
                        if (i != 128) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        if (i == 12) {
                                            this.LLILZ = false;
                                        }
                                    } else {
                                        this.LLILZIL = false;
                                    }
                                }
                            } else {
                                this.LLILLL = false;
                            }
                        } else {
                            this.LLIZ = false;
                        }
                    }
                } else {
                    if (this.LLJI) {
                        str2 = "BVusernamechange_click_change_name_change";
                    } else {
                        str2 = "BVusernamechange_click_submit_request_submit";
                    }
                    if (this.LLJILJIL) {
                        C1231820iA0.LIZ.getClass();
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJ(Boolean.FALSE, "submit_success");
                        C20684815ws.LJIILLIIL(str2, c2344009Gk.LIZ);
                    }
                    this.LLILZLL = false;
                }
            } else {
                this.LL = false;
            }
        } else {
            if (this.LLJIJIL) {
                str = "BVnamechange_click_change_name_change";
            } else {
                str = "BVnamechange_click_submit_request_submit";
            }
            if (this.LLJILJIL) {
                C1231820iA0.LIZ.getClass();
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJ(Boolean.FALSE, "submit_success");
                C20684815ws.LJIILLIIL(str, c2344009Gk2.LIZ);
            }
            this.LLILLJJLI = false;
        }
        InterfaceC1232420iAy interfaceC1232420iAy = this.LLJ;
        if (interfaceC1232420iAy != null && exc != null) {
            interfaceC1232420iAy.JE2(i, exc);
            if (!this.LLILZIL && !this.LLILLJJLI && !this.LLILLL && !this.LLILZ && !this.LLILZLL && !this.LL && !this.LLIZ) {
                this.LLJ.Pc0(false);
            }
        }
        InterfaceC1255580imK interfaceC1255580imK = this.LLJILJILJ;
        if (interfaceC1255580imK != null) {
            interfaceC1255580imK.LJII(exc);
        }
    }

    public final void LJIIIZ(String str, List<SignatureExtraInfo> list) {
        if (this.LLILLL) {
            return;
        }
        this.LLILLL = true;
        ((AbstractC848400XPy) C0XQ7.LJFF()).LJJLIIJ(this.LLIZLLLIL, str, list, this.LLJILLL);
    }
}
