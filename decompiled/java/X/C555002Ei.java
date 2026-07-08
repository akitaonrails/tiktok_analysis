package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ei, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C555002Ei extends Message<C555002Ei, C02LT> {
    public static final ProtoAdapter<C555002Ei> ADAPTER = new ProtoAdapter<C555002Ei>() { // from class: X.026r
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C555002Ei decode(ProtoReader protoReader) {
            C555002Ei c555002Ei = new C555002Ei();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c555002Ei.audio_extra = ProtoAdapter.STRING.decode(protoReader);
                            }
                        } else {
                            c555002Ei.audio_quality = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c555002Ei.audio_meta = C025U.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c555002Ei;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C555002Ei c555002Ei) {
            C555002Ei c555002Ei2 = c555002Ei;
            return C025U.ADAPTER.encodedSizeWithTag(1, c555002Ei2.audio_meta) + ProtoAdapter.INT64.encodedSizeWithTag(2, c555002Ei2.audio_quality) + ProtoAdapter.STRING.encodedSizeWithTag(3, c555002Ei2.audio_extra) + c555002Ei2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C555002Ei c555002Ei) {
            C555002Ei c555002Ei2 = c555002Ei;
            C025U.ADAPTER.encodeWithTag(protoWriter, 1, c555002Ei2.audio_meta);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c555002Ei2.audio_quality);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, c555002Ei2.audio_extra);
            protoWriter.writeBytes(c555002Ei2.unknownFields());
        }
    };
    public String audio_extra;
    public C025U audio_meta;
    public Long audio_quality;

    public C555002Ei() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02LT newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
