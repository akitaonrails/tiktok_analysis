package com.bytedance.aigc.proto;

import X.C08FF;

/* JADX INFO: loaded from: classes9.dex */
public enum SceneDomain {
    CUSTOMIZE(0),
    ID_INPUT(101),
    USER_PROFILE(102),
    PROMPT_PAGE(103),
    RECALL(104),
    EDIT(105),
    PUBLISH(106),
    DRAFT(107),
    CLOUD_DRAFT(108),
    SOCIAL(109),
    ROUTER(110),
    FOLLOW(111),
    QUOTA(201),
    UPLOAD(202),
    SERVER(203),
    POLLING(204),
    DOWNLOAD(205),
    DM_MESSAGE(206);

    public final int value;

    public int getValue() {
        return this.value;
    }

    public static SceneDomain fromValue(int i) {
        if (i != 0) {
            switch (i) {
                case 101:
                    return ID_INPUT;
                case 102:
                    return USER_PROFILE;
                case 103:
                    return PROMPT_PAGE;
                case 104:
                    return RECALL;
                case 105:
                    return EDIT;
                case 106:
                    return PUBLISH;
                case 107:
                    return DRAFT;
                case 108:
                    return CLOUD_DRAFT;
                case 109:
                    return SOCIAL;
                case 110:
                    return ROUTER;
                case 111:
                    return FOLLOW;
                default:
                    switch (i) {
                        case 201:
                            return QUOTA;
                        case 202:
                            return UPLOAD;
                        case 203:
                            return SERVER;
                        case 204:
                            return POLLING;
                        case 205:
                            return DOWNLOAD;
                        case 206:
                            return DM_MESSAGE;
                        default:
                            return null;
                    }
            }
        }
        return CUSTOMIZE;
    }

    public static SceneDomain valueOf(String str) {
        return (SceneDomain) C08FF.LIZ(SceneDomain.class, str);
    }

    SceneDomain(int i) {
        this.value = i;
    }
}
