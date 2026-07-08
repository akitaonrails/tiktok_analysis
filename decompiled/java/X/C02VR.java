package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02VR, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02VR extends Message<C02VR, C02VS> {
    public static final ProtoAdapter<C02VR> ADAPTER = new ProtoAdapter<C02VR>() { // from class: X.02VQ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02VR decode(ProtoReader protoReader) {
            C02VR c02vr = new C02VR();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02vr.auto_disappearance_time = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c02vr.content = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c02vr.type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02vr;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02VR c02vr) {
            C02VR c02vr2 = c02vr;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c02vr2.type) + ProtoAdapter.STRING.encodedSizeWithTag(2, c02vr2.content) + ProtoAdapter.INT64.encodedSizeWithTag(3, c02vr2.auto_disappearance_time) + c02vr2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02VR c02vr) {
        }
    };
    public Long auto_disappearance_time;
    public String content;
    public Integer type;

    public C02VR() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02VS newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
